import java.io.*;
class Rotation{
public static void main(String args[]){
int a[]={10,20,30};
int n=a.length;
int temp;
int i;
for(i=0;i<=n;i++)
{
temp=a[2];
a[1]=a[0];
a[2]=a[1];
a[0]=temp;
System.out.print(a[i]);
}}}

