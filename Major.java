class  Major
{ private String MID;
  private String MNAME;
  private Major M;
  Major(){}

  Major(String mid, String name){
	this.MID = mid;
	this.MNAME = name;
  
  }

  public String getMid(){
	return this.MID;
  }

  public void setMid(String mid){
	this.MID=mid;
}

  public String getMname(){
	return this.MNAME;
  }

  public void setMname(String name){
	this.MNAME=name;
	}
}