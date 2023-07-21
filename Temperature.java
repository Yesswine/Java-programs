import java.io.*;
import java.util.*;
class Temperature{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("celsius value");
double celsius=s.nextInt();
System.out.println(celsius);
double fahrenheit=celsius*1.8+32;
System.out.println(fahrenheit);
}}