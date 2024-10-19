package JavaPackage;

class balance {
	String name;
	double bal;

	balance(String n,double b) {
		this.name = n;
		this.bal = b;
	}

	void show() {
		if(bal<0) System.out.println("Account Closed! for " +name);
		System.out.println(name + " : $" + bal);
	}
}

public class account {
	public static void main(String[] args) {
		balance current[] = new balance[3];

		current[0] = new balance("jim",123.4);
		current[1] = new balance("Kim",345.6);
		current[2] = new balance("jil",546.8);

		for(int i= 0; i < 3 ; i++) current[i].show();

 	}
}