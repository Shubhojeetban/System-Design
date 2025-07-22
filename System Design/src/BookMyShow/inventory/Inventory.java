package BookMyShow.inventory;

import BookMyShow.models.Screen;
import BookMyShow.models.Show;
import BookMyShow.models.Theatre;
import BookMyShow.services.AdminService;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Inventory {
    public static List<Theatre> theatreList;
    public static List<Screen> screens;
    public static List<Show> shows;

    public Inventory() {
        AdminService adminService = new AdminService();
        theatreList = Arrays.asList(
                new Theatre(1, "Test1 Theatre", "Mumbai", 5),
                new Theatre(2, "Test2 Theatre", "Mumbai", 6),
                new Theatre(3, "Test3 Theatre", "Mumbai", 6)
        );

        for (Theatre theatre : theatreList) {
            for(int i = 1; i <= 5; i++) {
                int randomCapacity = 200 + new Random().nextInt(101);
                Screen screen = new Screen(i, randomCapacity);
                for(int j = 1; j <= 3; j++) {
                    Show show = new Show(j,
                            "Test show "+ i,
                            screen, Instant.now().toEpochMilli(),
                            Instant.now().plusSeconds(60 * 2).toEpochMilli(),
                            60L * 60L * 2L);
                    shows.add(show);
                    screen = adminService.addShow(show, screen, theatre);
                }
                screens.add(screen);
                theatre = adminService.addScreen(theatre, screen);
            }
        }
    }
}
