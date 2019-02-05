package backend;

public class Demo {

	public static void main(String[] args) {
		Textbook textbook1 = new Textbook("Hi", "Hello", "Yo", 3);
		Textbook textbook2 = new Textbook("2", "2", "2", 3);
		Textbook textbook3 = new Textbook("3", "3", "3", 1000);
//		BagTextBook bagTextBook= new BagTextBook(5);
//		bagTextBook.add(textbook1);
//		bagTextBook.add(textbook2);
//		bagTextBook.add(textbook3);
//		bagTextBook.display();
//		System.out.println();
//		System.out.println(bagTextBook.delete("1"));
//		System.out.println();
//		bagTextBook.display();
		
		Course courseTaken = new Course("Math", textbook1, 4.0);
		Course courseTaking = new Course("Science", textbook2, 3.0);
		Course courseNeedsTaken = new Course("Literature", textbook3, 3.0);
		BagCourse student1BagCourse = new BagCourse(1, 1, 1);
		student1BagCourse.addTaken(courseTaken);
		student1BagCourse.addTaking(courseTaking);
		student1BagCourse.addNeedsTaking(courseNeedsTaken);
		
		
		Faculty faculty1 = new Faculty("Dave", "Letterman", "1234", "Professor", 40000);
		Faculty faculty2 = new Faculty("Steve", "Jacobs", "4321", "Professor", 20000);
		Student student1 = new Student("Mick", "Mickelson", "1111", 4.0, "Computer Science", student1BagCourse);
		
		BagPeople personBag = new BagPeople(3);
		
		student1BagCourse.save();
		student1BagCourse.exportData("CourseText.txt");
		
//		personBag.add(student1);
//		personBag.add(faculty2);
//		personBag.add(faculty1);
//		personBag.save();
//		personBag.display();
//		personBag.export("PeopleArray.txt");
//		personBag.importData("");
//		System.out.println(faculty1.toString());
//		personBag.load();
		
	}

}
