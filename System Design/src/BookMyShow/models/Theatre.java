package BookMyShow.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Theatre {
    public String name;
    public List<Screen> screens;

    public Theatre(String name,  int noOfScreens) {
        this.name = name;
        this.screens = new ArrayList<>(noOfScreens);
    }

    public Optional<Screen> getScreen(Screen screen) {
        for (Screen screen1 : screens) {
            if (screen1.screenNo == screen.screenNo) return Optional.of(screen);
        }
        return Optional.empty();
    }

    public void addScreen(Screen screen) {
        screens.add(screen);
    }

    public void removeScreen(int screenNo) {
        Screen screenToBeDeleted = null;
        for(Screen screen : screens) {
            if(screen.screenNo == screenNo) {
                screenToBeDeleted = screen;
                break;
            }
        }

        if(screenToBeDeleted == null)
            throw new RuntimeException("No such screen found with screen number: " + screenNo);
        screens.remove(screenToBeDeleted);
    }

    @Override
    public String toString() {
        return "Theatre{" +
                ", name='" + name + '\'' +
                ", screens=" + screens +
                '}';
    }
}
