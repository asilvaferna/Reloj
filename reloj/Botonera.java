package reloj;

import java.time.LocalTime;

public class Botonera {

	private static boolean alarmActive;
	private static boolean setHour;
	private static boolean setAlarm;

	public static void alarmOn() {
		// TODO - implement Botonera.alarmOn
		
	}

	public static void alarmOff() {
		// TODO - implement Botonera.alarmOff
		
	}

	public static void configHour() {
            
            Display.showLed(true, false, true);
            
		
	}

	public static void configAlarm() {
		Display.showLed(false, true, true);
		
	}

	public static LocalTime plusHr(LocalTime hora) {
           
            return hora.plusHours(1);
            
	}

	public static LocalTime plusMin(LocalTime hora) {
		return hora.plusMinutes(1);
		
	}

	public static void stopAlarm() {
		// TODO - implement Botonera.stopAlarm
		
	}

}