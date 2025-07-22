package BookMyShow.models;

public class Show implements Comparable {
    public int id;
    public String name;
    public Screen screen;
    public long startTime;
    public long endTime;
    public long duration;

    public Show(int id, String name, Screen screen, long startTime, long endTime, long duration) {
        this.id = id;
        this.name = name;
        this.screen = screen;
        this.startTime = startTime;
        this.endTime = endTime;
        this.duration = duration;
    }

    @Override
    public int compareTo(Object o) {
        Show show = (Show)o;
        return (int) (this.startTime - show.startTime);
    }
}
