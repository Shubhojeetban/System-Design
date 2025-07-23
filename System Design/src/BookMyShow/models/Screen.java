package BookMyShow.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Screen {
    public int screenNo;
    public List<Seat> seats;
    public int capacity;
    public List<Show> shows;

    public Screen(int screenNo, int capacity) {
        this.screenNo = screenNo;
        this.capacity = capacity;
        this.seats = new ArrayList<>(capacity);
        this.shows = new ArrayList<>();
        fillSeats();
    }

    public void fillSeats() {
        for(int i = 1; i <= this.capacity; i++) {
            Seat seat = new Seat(i, false);
            this.seats.add(seat);
        }
    }

    public void addShow(Show show) {
        for(Show show1 : shows) {
            if((show.startTime <= show1.endTime  && show.startTime >= show1.startTime)
                    || (show.endTime >= show1.startTime && show.endTime <= show1.endTime)) {
                throw  new IllegalArgumentException("Show slot is already filled");
            }
            shows.add(show);
        }
    }

    public Seat getSeat(int seatNo) {
        for (Seat seat: seats) if(seat.seatNo == seatNo) return seat;
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Screen screen)) return false;
        return screenNo == screen.screenNo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(screenNo);
    }
}
