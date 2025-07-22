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
