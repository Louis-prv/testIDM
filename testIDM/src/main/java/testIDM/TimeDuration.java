package testIDM;

public class TimeDuration {
	
	int chiffre;
	int m;
	int h;
	int s;
	
	public TimeDuration(int x) throws BadBadValueException {
		if(x<0) {
			throw new BadBadValueException();
		}
		else {
			chiffre = x;
		}
		
	}
	
	public void versString() {
		while (chiffre > 3600) {
			chiffre = chiffre-3600;
			h = h+1;
		}
		while (chiffre > 60) {
			chiffre = chiffre-60;
			m = m+1;
		}
		s = chiffre;
		
		if (h>0) {
			System.out.println(h + "h" + m + "m" + s + "s");
		}
		else if(m>0) {
			System.out.println(m + "m" + s + "s");
		}
		else {
			System.out.println(s + "s");
		}
	}
	

	public static void main(String[] args) throws BadBadValueException {
		
		new TimeDuration(57).versString();
		
		new TimeDuration(750).versString();
		
		new TimeDuration(3985).versString();
		

	}

}
