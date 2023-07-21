import java.io.*;
import java.util.*;
import java.util.Arrays;
class Spynumber{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int i;
 int sum=0;
 int mul=1;
 int x;
while(n>0)
{
x=n%10;
n=n/10;
sum=sum+x;
mul=mul*x;
}
if(sum==mul)
{

System.out.println("spy number");
}
else
{
System.out.println("not a spy number");
}
}}