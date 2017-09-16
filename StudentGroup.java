import java.io.*;
public class StudentGroup implements StudentArrayOperation 
{
	int length,index;
	private Student[] students;
	
	public StudentGroup(int length) 
	{
		this.students = new Student[length];
	}
	
	public Student[] getStudents() throws IllegalArgumentException
	{
		try
		{
			if(length==0)
			{
				throw new IllegalArgumentException();
			}
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e);
		}
		return students;
	}
	
	void setStudents(Student[] students) 
	{
		try
		{
			if(students.length<0)
			{
				throw new IllegalArgumentException();
			}
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e);
		}
		this.students = students;
	}
	
	public Student getStudent(int index) throws IllegalArgumentException
	{
		//students[index]='';
		try
		{
			if(index<=0)
				throw new IllegalArgumentException();
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e);
		}
		return null;
	}	
	
	public void setStudent(Student student, int index) throws IllegalArgumentException
	{
		//student[index]=student;
		try
		{
			if(index<0 || index >students.length)
				throw new IllegalArgumentException();
			//if(student=="null")
				//throw new IllegalArgumentException();
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e);
		}
	}
	void add(Student student, int index)
	{
		
	}
		
	public static void main(String args[])
	{
		StudentGroup sgp=new StudentGroup(2);
		sgp.getStudents();
		//sgp.setStudents(4);
		sgp.getStudent(4);
		//sgp.setStudent(,);
		
	}

}
