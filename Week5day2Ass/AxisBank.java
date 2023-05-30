package Week5day2Ass;

public class AxisBank extends BankInfo{
	public void deposit() {
		System.out.println("deposit");
	}
	public static void main(String[] args) {
		AxisBank axis=new AxisBank();
		axis.deposit();
	}

}
