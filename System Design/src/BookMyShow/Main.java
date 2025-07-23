package BookMyShow;

import BookMyShow.dtos.BookingReq;
import BookMyShow.dtos.BookingRes;
import BookMyShow.models.Screen;
import BookMyShow.models.Show;
import BookMyShow.models.Theatre;
import BookMyShow.services.BookingService;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BookingService service = BookingService.getInstance();
        // Create Theatres
        Theatre theatre1 = new Theatre("Theatre 1", 2);
        Theatre theatre2 = new Theatre("Theatre 2", 1);

        // Create Screens
        Screen screen1 = new Screen(1, 5);
        Screen screen2 = new Screen(2, 5);
        Screen screen3 = new Screen(3, 5);

        // Create Shows
        Show show1 = new Show("Show 1", screen1, 100L, 200L);
        Show show2 = new Show("Show 2", screen2, 300L, 400L);
        Show show3 = new Show("Show 3", screen2, 500L, 600L);
        Show show4 = new Show("Show 4", screen3, 700L, 800L);
        Show show5 = new Show("Show 5", screen3, 900L, 1000L);

        // Add Shows to the screens
        screen1.addShow(show1);
        screen2.addShow(show2);
        screen2.addShow(show3);
        screen3.addShow(show4);
        screen3.addShow(show5);

        // Add screens to the theatre
        theatre1.addScreen(screen1);
        theatre1.addScreen(screen2);
        theatre2.addScreen(screen3);

        // Booking request
        BookingReq req1 = new BookingReq(theatre1, show1, 1);
        BookingReq req2 = new BookingReq(theatre1, show1, 2);
        BookingReq req3 = new BookingReq(theatre1, show1, 3);
        BookingReq req4 = new BookingReq(theatre1, show1, 4);

        BookingRes res1 = service.bookBooking(req1);
        BookingRes res2 = service.bookBooking(req2);
        BookingRes res3 = service.bookBooking(req3);
        BookingRes res4 = service.bookBooking(req4);

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);
    }
}