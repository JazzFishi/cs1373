class Teacher extends Person
{
  private String POSITION;
  Teacher(){}

  Teacher(String ID,String NAME,String POSITION){
  this.ID = ID;
  this.NAME = NAME;
  this.POSITION = POSITION;
  }
  Teacher(String ID, String NAME,Major M,String POSITION){
  this.ID = ID;
  this.NAME = NAME;
  this.M = M;
  this.POSITION = POSITION;
  }
  
  public String getPOSITION(){
  return POSITION;
  }
  public void setPOSITION(String POSITION){
  this.POSITION =POSITION;
  }

}
