package com.java200.swing.event3;
public class  TextAreaJPanel3Main{
	public static void main(String[] args) {
		TextAreaJPanel3 bp=new TextAreaJPanel3();//패널-adapter
		StartingJFrame frame=new StartingJFrame();//프레임
		frame.setMainJpanel(bp);
		frame.setSize(500,400);
		frame.validate();
	}
}
