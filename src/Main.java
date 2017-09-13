import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
	
	//compilation problems before to submit
StudentGroup stud=new StudentGroup();
Scanner sc=new Scanner(System.in);
stud.getStudents();

stud.getStudent(sc.nextInt());
stud.setStudent(sc.nextLine());
stud.addFirst(sc.nextLine());
stud.addLast(sc.nextLine());
stud.add(sc.nextLine(),sc.nextInt());
stud.remove(sc.nextLine());


	}

}
