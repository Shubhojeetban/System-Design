package BookMyShow.models;

public class Show {
    public String name;
    public Screen screen;
    public long startTime;
    public long endTime;
    public long duration;
    public double price;

    public Show(String name, Screen screen, long startTime, long endTime) {
        this.name = name;
        this.screen = screen;
        this.startTime = startTime;
        this.endTime = endTime;
        this.duration = endTime - startTime;
        this.price = duration * 50.00;
    }


}
