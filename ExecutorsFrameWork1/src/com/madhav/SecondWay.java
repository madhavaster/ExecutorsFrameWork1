package com.madhav;

import java.util.concurrent.TimeUnit;

public class SecondWay {
	public static void main(String[] args) {
		System.out.println("main thread started::::"+Thread.currentThread().getName());
		new SecondTask().start();
		Thread t = new SecondTask();
		t.start();
		System.out.println("main thread ended::::"+Thread.currentThread().getName());
	}
}

class SecondTask extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+"...."+i);
			try {
				TimeUnit.MILLISECONDS.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
