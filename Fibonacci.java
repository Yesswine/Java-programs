import java.io.*;
import java.util.*;
class Fibonacci{
public static void main(String args[]){
int n;
System.out.println("enter a no");
Scanner s =new Scanner(System.in);
n=s.nextInt();
int num1=0,num2=1,sum=0;
System.out.println(num1+" "+num2);
for(int i=2;i<=n;i++)
{
sum=num1+num2;
num1=num2;
num2=sum;
} 
System.out.println(num1+" "+num2);//

}}
