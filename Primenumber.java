import java.io.*;
import java.util.*;
class Primenumber{
public static void main(String args[]){
int n,count;
System.out.println("enter a no");
Scanner s =new Scanner(System.in);
n=s.nextInt();
if(n<2)
{
System.out.println("not prime");
}
else
{
int limit=n/2;
int i=2;
while(i<=limit){
if(n%i==0){
count=count++;}
else if(count==1)
{
System.out.println("prime");
}
else
{
System.out.println("not prime");
}}}}}

