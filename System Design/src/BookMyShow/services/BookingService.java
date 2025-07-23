package BookMyShow.services;

import BookMyShow.dtos.BookingReq;
import BookMyShow.dtos.BookingRes;
import BookMyShow.dtos.BookingStatus;
import BookMyShow.models.Seat;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BookingService {
    ExecutorService executorService = Executors.newCachedThreadPool();
    public static BookingService obj;
    private BookingService() {}

    // Singleton
    public static BookingService getInstance() {
        if(obj == null) {
            synchronized (BookingService.class) {
                if(obj == null) {
                    obj = new BookingService();
                }
            }
        }
        return obj;
    }
    public BookingRes bookBooking(BookingReq bookingReq) {
        return booking(bookingReq, true);
    }

    public BookingRes cancelBooking(BookingReq bookingReq) {
        return booking(bookingReq, false);
    }

    private BookingRes booking(BookingReq bookingReq, boolean isBooking) {
        Seat seat = bookingReq.show.screen.getSeat(bookingReq.seatNo);
        if(seat == null) throw new IllegalArgumentException("Invalid seat no.");
        if(seat.isBooked) throw new RuntimeException("Seat not available");
        executorService.submit(() -> {
            seat.isBooked = isBooking;
        });
        return new BookingRes(bookingReq.theatre.name,
                bookingReq.show.duration,
                bookingReq.show.name,
                bookingReq.show.startTime,
                seat.seatNo,
                isBooking ?BookingStatus.BOOKED : BookingStatus.CANCELLED);
    }
}
