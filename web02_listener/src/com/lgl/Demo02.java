package com.lgl;

import java.util.Timer;
import java.util.TimerTask;

public class Demo02 {
    static class MyTack extends TimerTask {

        @Override
        public void run() {
            System.out.println("执行任务：强强强强");

        }
    }

    public static void main(String[] args){
        Timer timer = new Timer();
        timer.schedule(new MyTack(),0,1000);
    }
}
