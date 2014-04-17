package com.java200.system.file.dataoutputstream.test;
import java.io.IOException;

import com.java200.system.file.dataoutputstream.WritingDatas;

public class WritingDatasMain {
	public static void main(String[] args) {
		WritingDatas wd=new WritingDatas();
		try {
			wd.writingData("writed.txt",false);
			wd.readingData("writed.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
