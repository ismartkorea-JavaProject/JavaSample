package com.java200.math;
public class  GCDUsingWhile
{
  //�ִ� ����� ��
  public  int gcd(int m,int n){
	  int temp=0;
	  while(m!=n){
		  if(m>n)m-=n;
		  else if(n>m)n-=m;
	  }
	  return m;
  }
  //�ּ� ����� ��
  public  int lcm(int m,int n){
	  return (m*n)/gcd(m,n);
  }
}
