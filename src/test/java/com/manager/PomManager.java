package com.manager;

import com.Pom.FifthPage;
import com.Pom.FirstPage;
import com.Pom.FourthPage;
import com.Pom.SecondPage;
import com.Pom.ThirdPage;

public class PomManager {
	private FirstPage Fp;
	private SecondPage Sp;
	private ThirdPage Tp;
	private FourthPage Fop;
	private FifthPage ft;

	public FifthPage getFifthPage() {
		return (ft==null)?ft =new FifthPage():ft;
	}

	public FourthPage getFourthPage() {
		return (Fop==null)?Fop =new FourthPage():Fop;
	}

	public FirstPage getFirstpage() {
		return (Fp==null)?Fp =new FirstPage():Fp;	
	}

	public ThirdPage getThirdPage() {
		return (Tp==null)?Tp =new ThirdPage():Tp;
	}

	public SecondPage getSecondpage() {
		return (Sp==null)?Sp =new SecondPage():Sp ;
	}
	
	

}
