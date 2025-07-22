package BookMyShow.dtos;

public class BookingRes {
    public String theatreName;
    public String city;
    public String showName;
    public long startTime;
    public long duration;
    public int seatNo;
    public BookingStatus status;

    @Override
    public String toString() {
        return "BookingRes{" +
                "theatreName='" + theatreName + '\'' +
                ", city='" + city + '\'' +
                ", showName='" + showName + '\'' +
                ", startTime=" + startTime +
                ", duration=" + duration +
                ", seatNo=" + seatNo +
                ", status=" + status +
                '}';
    }
}
