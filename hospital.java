import java.io.*;
class patient
{
	int id;
	String name;
	long phno;
	char gender;
	String cause;
}
class hospital
{
	public static void main(String args[])
	{
		patient p1=new patient();
		patient p2=new patient();
		p1.id=1;
		p1.name="Anu";
		p1.phno=78787898;
		p1.gender='F';
		p1.cause="cold";
		p2.id=2;
		p2.name="deepika";
		p2.phno=7987764;
		p2.gender='F';
		p2.cause="Dysentry";
		
		System.out.println(p1.id);
		System.out.println(p1.name);
		System.out.println(p1.phno);
		System.out.println(p1.gender);
		System.out.println(p1.cause);
		
		System.out.println(p2.id);
		System.out.println(p2.name);
		System.out.println(p2.phno);
		System.out.println(p2.gender);
		System.out.println(p2.cause);
	}
}