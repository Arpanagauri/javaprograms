package selenium;

	
	class Teacher {
		   private String designation = "Teacher";
		   private String collegeName = "BGIT";
		   public String getDesignation() {
			return designation;
		   }
		   protected void setDesignation(String designation) {
			this.designation = designation;
		   }
		   protected String getCollegeName() {
			return collegeName;
		   }
		   protected void setCollegeName(String collegeName) {
			this.collegeName = collegeName;
		   }
		   void does(){
			System.out.println("Teaching");
		   }
		}

		public class inheritance  extends Teacher{
		   String mainSubject = "Physics";
		   public static void main(String args[]){
			   inheritance obj = new inheritance ();
			   inheritance obj1 = new inheritance ();
			/* Note: we are not accessing the data members 
			 * directly we are using public getter method 
			 * to access the private members of parent class
			 */
			   obj.setDesignation("Professor");
			   
			System.out.println(obj.getCollegeName());
			System.out.println(obj.getDesignation());
			System.out.println(obj1.getDesignation());
			System.out.println(obj.mainSubject);
			obj.does();
		   }
		}
	
	
	
	


