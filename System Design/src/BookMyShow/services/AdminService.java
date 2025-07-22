package BookMyShow.services;

import BookMyShow.models.Screen;
import BookMyShow.models.Show;
import BookMyShow.models.Theatre;

import java.util.List;

public class AdminService {
    public void addScreen(Theatre theatre, Screen screen) {
        for(Screen screen1 : theatre.screens) {
            if(screen1.equals(screen)) throw new RuntimeException("Screen already present!");
        }
        theatre.screens.add(screen);
    }

    public void addShow(Show show, int screenNo, Theatre theatre) {
        if (theatre.getScreen(screenNo).isPresent()) {
            Screen screen = theatre.getScreen(screenNo).get();
            if(isSlotAvailableForShow(screen, show.startTime, show.endTime)) {
                screen.shows.add(show);
            }
        } else {
            throw new RuntimeException("Screen not found with screen number: " + screenNo);
        }
    }

    private boolean isSlotAvailableForShow(Screen screen, long start, long end) {
        List<Show> shows = screen.shows;

        // show1
        for(Show show : shows) {
            if()
        }
        return false;
    }
}
