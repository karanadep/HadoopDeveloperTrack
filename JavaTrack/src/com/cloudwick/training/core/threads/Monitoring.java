package com.cloudwick.training.core.threads;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by cloudwickguest on 8/4/16.
 */
public class Monitoring {
    Timer timerobj;
    public static void main(String[] args) {
        new Monitoring(5);
    }

    class TimerMonitoring extends TimerTask {
        @Override
        public void run(){
            System.out.println("Timer Task Finished");
          // timerobj.cancel();
        }
    }

    //class to perform something
    public Monitoring(int seconds){
        timerobj = new Timer();
        timerobj.schedule(new TimerMonitoring(),new Date(),seconds*1000);
    }
}
