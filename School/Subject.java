class Subject{
	private String SID;
	private String SNAME;
	private double CREDIT;

	Subject(){}

	Subject(String SID,String SNAME,double CREDIT){
		this.SID=SID;
		this.SNAME=SNAME;
		this.CREDIT=CREDIT;
	}

	public String getSID(){
		return this.SID;
	}

	public void setSID(String SID){
		this.SID=SID;
	}


	public String getSNAME(){
		return this.SNAME;
	}

	public void setSNAME(String SNAME){
		this.SNAME=SNAME;
	}

	
	public double getCREDIT(){
		return this.CREDIT;
	}

	public void setCREDIT(double CREDIT){
		this.CREDIT=CREDIT;
	}

}