package com.madhav;

public class FirstWay {
	public static void main(String[] args) {
		/*FirstTask ft = new FirstTask();
		ft.start();*/
		new FirstTask();
	}
}

class FirstTask extends Thread{
	FirstTask(){
		this.start();
	}
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}
