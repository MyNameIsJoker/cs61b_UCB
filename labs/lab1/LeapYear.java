public class LeapYear {
	public static void main (String[] args) {
		for (int i = 0; i < args.length; i++){
			try{
				int year = Integer.parseInt(args[i]);
				checkLeapYear(year);
			}catch (NumberFormatException e) {
                System.out.printf("%s is not a valid number.\n", args[i]);
            }
		}
	}

	public static void checkLeapYear(int year){
		if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			System.out.println(year + " is a leap year.");
		}
		else {
			System.out.println(year + " is not a leap year.");
		}
	}
}