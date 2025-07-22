package BookMyShow.services;

import BookMyShow.models.Screen;
import BookMyShow.models.Show;
import BookMyShow.models.Theatre;

public class AdminService {
    public Theatre addScreen(Theatre theatre, Screen screen) {
        for(Screen screen1 : theatre.screens) {
            if(screen1.equals(screen)) throw new RuntimeException("Screen already present!");
        }
        theatre.screens.add(screen);
        return theatre;
    }

    public Screen addShow(Show show, Screen screen, Theatre theatre) {
        if (theatre.getScreen(screen).isPresent()) {
            screen.shows.add(show);
            return screen;
        } else {
            throw new RuntimeException("Screen not found with screen number: " + screen.screenNo);
        }
    }
}
