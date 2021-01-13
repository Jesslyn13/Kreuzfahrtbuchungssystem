import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeSpan implements Constants {

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
}
