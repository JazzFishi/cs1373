class  Student extends Person
{ private double GPA;

Student(){}

Student (String id,String NAME,double gpa){
	this.ID =id;
	this.NAME = NAME;
	this.GPA = gpa;
}
Student(String id,String NAME, Major m, double gpa){
    this.ID =id;
	this.NAME = NAME;
	this.GPA = gpa;
	this.GPA = gpa;
  }
public double getGpa(){
	return this.GPA;
  }
public void setGPA(double gpa){
	this.GPA = gpa;
	  }
}