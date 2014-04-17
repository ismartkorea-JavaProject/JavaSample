package com.java200.system.file.printwriter.test;
import com.java200.system.file.printwriter.ReadAndWriteFromFile;
public class ReadAndWriteFromFileMain 
{
	public static void main(String[] args) 
	{
		String fname="aaa.txt";
		ReadAndWriteFromFile baw=new ReadAndWriteFromFile();
		try{
			//ctrl+c 콘솔 :  이클립스 ctrl+Z
			System.out.println("끝내고 싶다면 ctrl+Z를 입력하시오");
			baw.readnwrite(fname,false);//clear
			//baw.readnwrite(fname,true);//append
			//출력하기
			baw.readFile(fname);
		}catch(Exception ex){
			System.out.println(ex);
		}
	}
}
