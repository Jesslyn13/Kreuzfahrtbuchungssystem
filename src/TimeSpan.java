import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeSpan {

    // Date formatting will be used to store the dates at which a cabin is booked
    static final DateFormat DATE_FORMAT = new SimpleDateFormat("dd.MM.yyyy");
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
