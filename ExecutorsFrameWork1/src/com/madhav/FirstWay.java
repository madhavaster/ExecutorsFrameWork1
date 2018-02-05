package com.madhav;

import java.util.concurrent.TimeUnit;

public class FirstWay {
	public static void main(String[] args) {
		/*FirstTask ft = new FirstTask();
		ft.start();*/
		System.out.println("main thread started::::"+Thread.currentThread().getName());
		new FirstTask();
		new FirstTask();
		System.out.println("main thread ended::::"+Thread.currentThread().getName());
	}
}

class FirstTask extends Thread{
	FirstTask(){
		this.start();
	}
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
