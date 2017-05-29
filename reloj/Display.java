package reloj;

/**
 * This class is related to all the visual operations of the app.
 */
import java.time.LocalTime;

public class Display {

    private static boolean functionLed;
    private static boolean alarmLed;
    private static boolean clockLed;
    
	/**
	 * Displays the current hour.
	 * @param time
	 */
	public static LocalTime showHr(LocalTime time) {
		// TODO - implement Display.showHr
		return time;
	}

	/**
	 * Displays the alarm hour.
	 * @param time
	 */
	public static void showAlarm(LocalTime time) {
		// TODO - implement Display.showAlarm
		
	}

	/**
	 * Displays the leds depending on the current mode.
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