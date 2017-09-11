import java.util.Date;
public class Main {

	public static void main(String[] args) {

		StudentGroup b1=new StudentGroup(10);

	Date d=new Date(1996,24,10);
	Student s1=new Student(20,"srikanth",d,89.0);

                b1.addFirst(s1);

              System.out.println(b1.getStudent(0).getId());






	}

}
