// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		// In Java, the command-line arguments args[0], args[1], ... are represented
		// each by a string. In this program, the single "hh:mm" input is represented

		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		String AMPM = "AM";
		if (hours>12){
			hours =  hours-12;
			AMPM = "PM";
		}

		if (hours == 12 && minutes!= 0){
			AMPM = "PM";
		}

		String formattedMinutes ="";
		if (minutes<10){
			formattedMinutes = "0";
		}

		System.out.println(hours+":"+formattedMinutes+minutes+" "+AMPM);

	}
}