package BookMyShow.dtos;

import BookMyShow.models.Seat;
import BookMyShow.models.Show;
import BookMyShow.models.Theatre;

public class BookingReq {
    public Show show;
    public Theatre theatre;
    public int seatNo;

    public BookingReq(Theatre theatre, Show show, int seatNo) {
        this.theatre = theatre;
        this.show = show;
        this.seatNo = seatNo;
    }
}
