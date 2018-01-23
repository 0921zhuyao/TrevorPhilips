package net.wendal.nutzbook.timer;

import java.util.Calendar;
import java.util.Date;
import java.util.TimerTask;

public class ScheduledExecutorTest2 extends TimerTask {

	private String jobName = "";

    public ScheduledExecutorTest2(String jobName) {
        super();
        this.jobName = jobName;
    }
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Date = "+new Date()+", execute " + jobName);
	}

	public Calendar getEarliestDate(Calendar currentDate,int dayOfWeek, int hourOfDay, int minuteOfDay, int secendOfMinite){
		int currentWeekOfYear = currentDate.get(Calendar.WEEK_OF_YEAR);
		int currentDayOfWeek = currentDate.get(Calendar.DAY_OF_WEEK);
		int currentHour = currentDate.get(Calendar.HOUR_OF_DAY);
		int currentMinute = currentDate.get(Calendar.MINUTE);
		int currentSecend = currentDate.get(Calendar.SECOND);
		return currentDate;
	}
}
