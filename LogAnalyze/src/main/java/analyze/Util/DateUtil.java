package analyze.Util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.log4j.Logger;

public class DateUtil {

    private static Logger logger = Logger.getLogger(DateUtil.class);

    private String DateFormat = "yyyy-MM-dd HH:mm:ss,SSS";

    private Long getStringToMillsecond(String timeStr) {

        Long timeInMill = 0L;

        if(timeStr.isEmpty()) {
            return 0L;
        }

        SimpleDateFormat sdf = new SimpleDateFormat(this.DateFormat);

        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(sdf.parse(timeStr));
            timeInMill = calendar.getTimeInMillis();
        } catch (Exception e) {
            e.printStackTrace();
        }
        logger.info("時間<" + timeStr + "> MilliSecond <" +  timeInMill + ">");
        return timeInMill;
    }

    public Long getTimeCha(String startTime, String endTime) {

        Long timeCha = 0L;
        try {
            Long sTime = this.getStringToMillsecond(startTime);
            Long eTime = this.getStringToMillsecond(endTime);
            timeCha = eTime - sTime;
        }catch (Exception e) {
            e.printStackTrace();
        }

        return timeCha;
    }

    public String getDateFormat() {
        return DateFormat;
    }

    public void setDateFormat(String dateFormat) {
        DateFormat = dateFormat;
    }

}
