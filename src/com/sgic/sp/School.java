package com.sgic.sp;

public class School {

	MethInter meth;

	public void setMeth(MethInter meth) {
		this.meth = meth;
	}
	School()
	{
		
	}
	School(MethInter meth){
	this.meth=meth;
	}
	public void getName() {
		meth.getName();
	}

}
