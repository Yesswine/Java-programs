import java.io.*;
import java.util.*;
import java.util.Arrays;
class Merchant
{
public static void main(String args[])
{
	int n,i,j;
	int count=0;
	Scanner s=new Scanner(System.in);
 n=s.nextInt();

int a[]=new int[n];
for(i=0;i<n;i++)
{
	for(j=i+1;j<n;j++)
{
a[i]=s.nextInt();
if (a[i]==a[i+1])
{
	count=count++;
	
}
for(i=0;i<n;i++){
System.out.println(count);
}}}}}
