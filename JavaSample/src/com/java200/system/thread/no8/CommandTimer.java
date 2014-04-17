package com.java200.system.thread.no8;
public  class CommandTimer extends HTimer {
	public synchronized void commit(){
		System.out.println(new java.util.Date()+": !!!");
	}
}
