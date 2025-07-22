package BookMyShow.dtos;

import BookMyShow.dtos.models.Seat;
import BookMyShow.dtos.models.Show;
import BookMyShow.dtos.models.Theatre;

public class BookingReq {
    public int id;
    public Show show;
    public Theatre theatre;
    public Seat seat;

}
