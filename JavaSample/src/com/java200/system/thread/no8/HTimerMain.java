package com.java200.system.thread.no8;
public class HTimerMain {
	public static void main(String[] args) {

		CommandTimer ct=new CommandTimer();
		ct.start(5000,2000,1000);//5�ʵ��� 2���ĺ��� 1�ʰ�������
		//ct.start(0,0,1000);//1��
	}
}
