class Subject{
	protected String SID;
	protected String SNAME;
	protected double Credit;

	Subject(){}

	Subject(String Sid,String Sname,double credit){
		this.SID=Sid;
		this.SNAME=Sname;
		this.Credit=credit;
	}

	public String getSid(){
		return this.SID;
	}

	public void setSid(String Sid){
		this.SID=Sid;
	}


	public String getSname(){
		return this.SNAME;
	}

	public void setSname(String Sname){
		this.SNAME=Sname;
	}

	
	public double getcredit(){
		return this.Credit;
	}

	public void setCredit(double credit){
		this.Credit=credit;
	}

}