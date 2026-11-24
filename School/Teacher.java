class Teacher extends Person  
{
  private String POSITION;
  Teacher(){}

  Teacher(String id,String name,String position){
  this.ID = id;
  this.NAME = name;
  this.POSITION = position;
  }
  Teacher(String id, String name,Major m,String position){
  this.ID = id;
  this.NAME = name;
  this.M =m;
  this.POSITION = position;
  }
  
  public String getPOSITION(){
  return POSITION;
  }
  public void setPOSITION(String position){
  this.POSITION =position;
  }

}
