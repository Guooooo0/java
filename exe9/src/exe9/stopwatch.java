package exe9;
import java.util.*;
public class stopwatch {
	private long starttime;
	private long endtime;
	public stopwatch() {
		java.util.Date date=new java.util.Date();
		starttime=date.getTime();
	}
	public void start(long starttime) {
		this.starttime=starttime;
	}
	public void end(long endtime) {
	    this.endtime=endtime;
	}
	public long getElapsedTime() {
		Date time=new Date();
		return time.getTime();
	}
	public long getStartTime() {
		return starttime;
	}
	public long getEndTime() {
		return endtime;
	}

}
