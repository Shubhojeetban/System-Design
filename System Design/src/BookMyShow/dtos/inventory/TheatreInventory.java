package BookMyShow.dtos.inventory;

import BookMyShow.dtos.models.Screen;
import BookMyShow.dtos.models.Show;
import BookMyShow.dtos.models.Theatre;

import java.util.Arrays;
import java.util.List;

public class TheatreInventory {
    public static List<Theatre> theatreList;
    public static List<Screen> screens;
    public static List<Show> shows;
    static {
        theatreList = Arrays.asList(
                new Theatre(1, "Test1 Theatre", "Mumbai", 5),
                new Theatre(2, "Test2 Theatre", "Mumbai", 6),
                new Theatre(3, "Test3 Theatre", "Mumbai", 6)
        );
    }


}
