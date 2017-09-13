import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		
		for(int i=0;i<students.lenght();i++)
{
		System.out.print(students[i]);
		return null;
	}
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		if(student == null){throw new IllegalArgumentException("NULL");}
		this.Student[]=Student;
		
		
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if(index<0||index>=students.length){throw new IllegalArgumentException("NULL");}
		for(int i=0;i<students.lenght();i++)
		{
			if(i==index)
				System.out.print(students[i]);
		}
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		if(student == null){throw new IllegalArgumentException("NULL");}
		else(index<0||index>=students.length){throw new IllegalArgumentException("NULL");}
		this.students=students[index];
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		if(student == null){throw new IllegalArgumentException("NULL");}

		students.lenght=students.lenght()++;
		for(int i=0;i<students.lenght();i++)
		students[i+1]=students[i];
	students[0]==this.student;
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		if(student == null){throw new IllegalArgumentException("NULL");}
	
		students.lenght=students.lenght()++;
		students[length]==this.student;
		
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		if(student == null){throw new IllegalArgumentException("NULL");}
		else(index<0||index>=students.length){throw new IllegalArgumentException("NULL");}
		students.lenght=students.lenght()++;
		for(int i=index;i<students.lenght();i++)
		{
			students[i+1]=students[i];
		}
		students[index]==this student;
	}
	

	@Override
	public void remove(int index) {
		// Add your implementation here
		if(index<0||index>=students.length){throw new IllegalArgumentException("NULL");}
		for(int i=index;i<students.lenght();i++)
			students[i]=students[i+1];
		students.lenght=students.lenght()--;
		
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		if(index<0||index>=students.length){throw new IllegalArgumentException("NULL");}
		for(int i=0;i<students.lenght();i++)
		{
			if(students[i]==this.student)
			{
				students[i]=students[i+1];
			}
	}
	students.lenght=students.lenght()--;
}
	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		private s[];
		int l;
		for(int i=0;i<index;i++)
		{
			s[i]=students[i];
			students.lenght()=students.length()--;
	}
	l=s.lenght();
	students.length()=l;
	for(int i=0;i<l;i++)
		{
	students[i]=s[i];
	}
	}
	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
