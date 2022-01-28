package selenium;


class person{
	

void eat() {
	
	
	System.out.println("Eats food");
	
}

void sleep() {
	
	System.out.println("Sleeps for 10 hours");
}

	
}

class student extends person{
int classno,rollno;
String college,subject;

student()
{
	
}
student(int rollno)
{
	this.rollno=rollno;
}

void sleep() {
	
	System.out.println("Sleeps for 8 hours");
}

void gotocollege() {
	
	System.out.println("Goes to college" + rollno);
}

void personsleep()
{
	super.sleep();
	System.out.println("Inside person sleep thru student");
}
	
	
}

class engineeringstud extends student{

	void workhard() {
		System.out.println("Has got a masters degree");
	}
	
}


public class homeworkinherit2 {

	public static void main(String[] args) {
		System.out.println("The person :- ");
	engineeringstud obj = new engineeringstud();
	    obj.sleep();
	    obj.eat();
	    obj.personsleep();
	    System.out.println("The student:- ");
    student obj1= new student(28);
        obj1.sleep();
   }

}
