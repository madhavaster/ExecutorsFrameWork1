package com.madhav;

public class FirstWay {
	public static void main(String[] args) {
		FirstTask ft = new FirstTask();
		ft.start();
	}
}

class FirstTask extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}
