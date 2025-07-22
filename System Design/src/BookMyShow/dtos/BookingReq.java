package BookMyShow.dtos;

import BookMyShow.models.Seat;
import BookMyShow.models.Show;
import BookMyShow.models.Theatre;

public class BookingReq {
    public int id;
    public Show show;
    public Theatre theatre;
    public Seat seat;

}
