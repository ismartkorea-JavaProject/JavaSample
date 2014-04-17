package com.java200.system.userexception;
public class  MyZeroException extends Exception{
	
	public MyZeroException(String message){
		super(message);
	}
	public MyZeroException(){
		this("헤헤 네가 만들었어!!");
	}
}