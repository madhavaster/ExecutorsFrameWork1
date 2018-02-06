package com.madhav.demo;

public class App {
public static void main(String[] args) {
	Thread t = new Thread(new Runner());
	t.start();
}
}

class Runner implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
	}
	
}
