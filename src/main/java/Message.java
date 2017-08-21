import org.apache.log4j.Logger;

import java.time.LocalTime;
import java.util.ResourceBundle;

/**
 * Created by PavelGrudina on 19.08.2017.
 */
public class Message {

    private String message;
    private int timeNow = LocalTime.now().getHour();
    final static Logger logger = Logger.getLogger(AppRun.class);


    public String getMessage() {

        ResourceBundle res = ResourceBundle.getBundle("data");
        if (timeNow >= 6 && timeNow < 9) {
            message = res.getString("morning");
        }
        if (timeNow >= 9 && timeNow < 19) {
            message = res.getString("day");
        }
        if (timeNow >= 19 && timeNow < 23) {
            message = res.getString("evening");
        }
        if (timeNow < 6 || timeNow == 23 || timeNow == 0) {
            message = res.getString("night");
        }
        logger.info("Get message: " + message);
        return message;
    }

    public int getTimeNow() {
        return timeNow;
    }

    public void setTimeNow(int timeNow) {
        this.timeNow = timeNow;
    }
}
