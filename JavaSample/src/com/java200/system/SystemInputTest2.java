package com.java200.system;
import java.io.IOException;
public class  SystemInputTest2
{
	public static void main(String[] args) {
		char cin='0';
		try{
			while(cin!='/'){
				do{
					cin=(char)System.in.read();//read -> return int 
					System.out.print(cin);                         
				}while(cin=='\n' | cin=='\r');
			}
		}catch(IOException e){//����ó�� read ������
			System.out.println(e.getMessage()); 
		}
	}
}
