package backend;

public class BackendDemo {

	public static void main(String[] args) {
		Textbook tbook1 = new Textbook("Title1", "Author1", "Publisher1", 1.0);
		Textbook tbook2 = new Textbook("Title2", "Author2", "Publisher2", 2.0);
		Textbook tbook3 = new Textbook("Title3", "Author3", "Publisher3", 3.0);
		
		Course course1 = new Course("Course1", tbook1, 1.0); //0
		Course course2 = new Course("Course2", tbook2, 2.0); //1
		Course course3 = new Course("Course3", tbook3, 3.0); //2
		Course course4 = new Course("Course3", tbook3, 3.0); //3
		Course course5 = new Course("Course3", tbook3, 3.0); //4
		Course course6 = new Course("Course3", tbook3, 3.0); //5

		BagCourse courseBag1 = new BagCourse(5, 5, 5);
		courseBag1.addTaking(course1);
		courseBag1.addTaken(course2);courseBag1.addTaken(course3); courseBag1.addTaken(course4);courseBag1.addTaken(course5);
		courseBag1.addNeedsTaking(course6);
		
		BagCourse courseBag2 = new BagCourse(1, 1, 1);
		
		Address address = new Address("56.","Ledgewood Dr.", "Smithtown", "NY", "11787");
		Student student = new Student("Wanwan", "Xu", "3476546814", address, 1.0, "CSE", courseBag1);
		System.out.println(student.toString());
	}

}
