
import java.io.*;
import java.util.*;
class Parking
{
public static void main(String args[])
{
int i,j;
int count=0;
int max=0;
Scanner sc=new Scanner(System.in);
int r=sc.nextInt();
int c=sc.nextInt();
int a[][]=new int[r][c];
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
a[i][j]=sc.nextInt();
}
}
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
if(a[i][j]>=1)
{
count++;
}
if(a[i][j]>count)
{
	max=a[i][j];
}
System.out.print(max);
}}}}
