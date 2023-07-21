import java.io.*;

class Armstrong{
public static void main(String args[]){
int n=1,sum=0,a;
System.out.println("armstrong no bw 1 to 500");
while(n<500)
{
a=n%10;
n=n/10;
int s=a*a*a;
sum=sum+s;
}
int a;
if(a==sum)
{
System.out.println("armstrong no");
}
else
{
System.out.println("not a armstrong no");
}}}