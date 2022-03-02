package tns.application;

import tns.framework.CurrentAcc;

public class MMCureentAcc extends CurrentAcc {

	public MMCureentAcc(int accno, String accname, float charges) {
		super(accno, accname, charges);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Withdraw(float charges) {
		System.out.println("You have saving money "+charges+ " along with current account"+Creditlimit);
	}
	
}