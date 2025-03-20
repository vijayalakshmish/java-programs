package modifiers.java;

public class student {
	    private String name;
	    private int studentId;

	    public student(String name, int studentId) {
	        this.name = name;
	        this.studentId = studentId;
	    }

	    public String getName() { // Getter method
	        return name;
	    }

	    public void setName(String name) { // Setter method
	        this.name = name;
	    }

	    public int getStudentId() { // Getter method
	        return studentId;
	    }

	    public void setStudentId(int studentId) { // Setter method
	        this.studentId = studentId;
	    }

	    public static void main(String[] args) {
	        student student = new student("Alice", 12345);
	        System.out.println("Name: " + student.getName() + ", ID: " + student.getStudentId());
	        
	        student.setName("Bob");
	        student.setStudentId(67890);
	        System.out.println("Updated Name: " + student.getName() + ", Updated ID: " + student.getStudentId());
	    }
	}



