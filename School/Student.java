class  Student extends Person
{ private double GPA;

	Student(){}

	Student (String ID,String NAME,double GPA){
	this.ID =ID;
	this.NAME = NAME;
	this.GPA = GPA;
}
	Student(String ID,String NAME, Major M, double GPA){
    this.ID =ID;
	this.NAME = NAME;
	this.M = M;
	this.GPA = GPA;
  }
	public double getGPA(){
	return this.GPA;
  }
	public void setGPA(double GPA){
	this.GPA = GPA;
	  }
}