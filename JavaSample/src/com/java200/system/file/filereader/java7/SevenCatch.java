package com.java200.system.file.filereader.java7;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class SevenCatch {
	public static void main(String[] args) {
		String fname="src\\kr\\co\\infopub\\chap177\\java7\\SevenCatch.java";//eclipse
		//String fname="lotto.txt";
		try(
			FileReader fr = new FileReader(fname);
			BufferedReader br=new BufferedReader(fr)
			){
			StringBuffer sb=new StringBuffer();
			String s="";
		    while((s=br.readLine())!=null){
				sb.append(s+"\n");
			}
			s=sb.toString();
			System.out.println(s);
			
		} catch (IOException  e) {
			System.out.println();
		}
	}
}
