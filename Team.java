import java.io.*;
import java.util.*;
class Team{
public static void main(String args[]){
	int i,j,sum=0;
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int m=s.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
{
	a[i]=s.nextInt();
}
for(j=0;j<m;j++)
{
	System.out.println(a[i]);
}
int b[]=new int[m];
for(i=0;i<n;i++)
{
	b[i]=s.nextInt();
for(j=0;j<m;j++)
{
	System.out.println(b[i]);
}
sum=a.length+b.length;
int add=sum-2;
System.out.println(add);
}}}

