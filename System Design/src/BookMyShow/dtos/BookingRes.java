package BookMyShow.dtos;

public class BookingRes {
    public String theatreName;
    public String showName;
    public long startTime;
    public long duration;
    public int seatNo;
    public BookingStatus status;

    public BookingRes(String theatreName,  long duration, String showName, long startTime, int seatNo, BookingStatus status) {
        this.theatreName = theatreName;
        this.duration = duration;
        this.showName = showName;
        this.startTime = startTime;
        this.seatNo = seatNo;
        this.status = status;
    }

    @Override
    public String toString() {
        return "BookingRes{" +
                "theatreName='" + theatreName + '\'' +
                ", showName='" + showName + '\'' +
                ", startTime=" + startTime +
                ", duration=" + duration +
                ", seatNo=" + seatNo +
                ", status=" + status +
                '}';
    }
}
