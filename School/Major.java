class  Major
{ private String MID;
  private String MNAME;
  private Major M;
  Major(){}

  Major(String MID, String NAME){
	this.MID = MID;
	this.MNAME = NAME;
  
  }

  public String getMID(){
	return this.MID;
  }

  public void setMID(String MID){
	this.MID=MID;
}

  public String getMNAME(){
	return this.MNAME;
  }

  public void setMNAME(String NAME){
	this.MNAME=NAME;
	}
}