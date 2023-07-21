import java.io.*;
import java.util.*;
class Vote{
public static void main(String args[]){

Scanner s=new Scanner(System.in);
System.out.println("enter the num");
int X=s.nextInt();
String a=(X>=18) ? "eligible to vote":"not eligible to vote";
System.out.println(a);
}}