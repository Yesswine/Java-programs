import java.io.*;
import java.util.*;
class Leapyear{
public static void main(String args[]){

Scanner s=new Scanner(System.in);
System.out.println("enter the num");
int X=s.nextInt();
if(X%4==0)
{
System.out.println("the num is" +X+ "leap year");
}

else 
{
System.out.println("the num is" +X+ "not leap year");
} 
}}