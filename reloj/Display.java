package reloj;


import java.time.LocalTime;

public class Display {

    private static boolean functionLed;
    private static boolean alarmLed;
    private static boolean clockLed;
    
	/**
	 * 
	 * @param time
	 */
	public static LocalTime showHr(LocalTime time) {
		// TODO - implement Display.showHr
		return time;
	}

	/**
	 * 
	 * @param time
	 */
	public static void showAlarm(LocalTime time) {
		// TODO - implement Display.showAlarm
		
	}

	/**
	 * 
	 * @param clockLed
	 * @param alarmLed
	 * @param functionLed
	 */
	public static void showLed(boolean showClock, boolean showAlarm, boolean showFunctionSet) {
		
            clockLed = showClock;
            alarmLed = showAlarm;
            functionLed = showFunctionSet;
            
		
	}

}