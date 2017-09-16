import java.lang.*;
public interface StudentArrayOperation 
{
	Student[] getStudents();
	void setStudents(Student[] students);
	public Student getStudent(int index);
	public void setStudent(Student student, int index);
	void add(Student student, int index);
}

