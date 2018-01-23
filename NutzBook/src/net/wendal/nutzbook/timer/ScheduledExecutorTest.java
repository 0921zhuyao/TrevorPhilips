package net.wendal.nutzbook.timer;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorTest implements Runnable {

	private String jobName = "";
	
	public ScheduledExecutorTest(String jobName) {
		super();
		this.jobName = jobName;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("execute " + jobName);
	}

	public static void main(String[] args) {
		ScheduledExecutorService executorService = Executors.newScheduledThreadPool(10);
		long initialDelay1 = 1;
		long period1 = 1;
		executorService.scheduleAtFixedRate(new ScheduledExecutorTest("job1"), initialDelay1, period1, TimeUnit.SECONDS);
		long initialDelay2 = 2;
		long period2 = 2;
		executorService.scheduleWithFixedDelay(new ScheduledExecutorTest("job2"), initialDelay2, period2, TimeUnit.SECONDS);
	}
}
