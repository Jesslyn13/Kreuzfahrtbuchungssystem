import java.util.Date;

public class TimeSpan{

    // Date formatting will be used to store the dates at which a cabin is booked
    final Date startDate;
    final Date leaveDate;

    public TimeSpan(Date startDate, Date leaveDate) {
        this.startDate = startDate;
        this.leaveDate = leaveDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getLeaveDate() {
        return leaveDate;
    }

    public boolean isOverlapping(TimeSpan t) {
        return !(startDate.before(t.getLeaveDate()) && t.getStartDate().before(leaveDate));
    }
}