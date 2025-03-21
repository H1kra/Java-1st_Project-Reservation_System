package skola.uni.object;
import java.time.LocalDate;
import java.time.LocalTime;
import skola.uni.consts.ClassEnum;
import skola.uni.consts.ClassRoom;


public class Reservation {
    public String name;
    public LocalDate startDate;
    public LocalTime startTime;
    public LocalDate endDate;
    public LocalTime endTime;
    public ClassEnum status;
    public ClassRoom room;

    public Reservation(String name, LocalDate startDate, LocalTime startTime, LocalDate endDate, LocalTime endTime, ClassEnum status, ClassRoom room) {
        this.name = name;
        this.startDate = startDate;
        this.startTime = startTime;
        this.endDate = endDate;
        this.endTime = endTime;
        this.status = status;
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public ClassEnum getStatus() {
        return status;
    }

    public ClassRoom getRoom() {
        return room;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public void setStatus(ClassEnum status) {
        this.status = status;
    }

    public void setRoom(ClassRoom room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Reservation{name='" + name + "', startDate=" + startDate + ", startTime=" + startTime +
                ", endDate=" + endDate + ", endTime=" + endTime + ", status=" + status + ", room=" + room + "}";
    }

}
