package com.java200.system.thread.no1;
public class  MyRun implements Runnable
{
	public void run(){
		show();
	}
	public void show(){
		for(int i=0;i<500;i++){
			System.out.print("S");
		}
	}
}
