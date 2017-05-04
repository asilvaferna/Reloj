package reloj;


import java.time.LocalTime;

public class Display {

    private boolean functionLed;
    private boolean alarmLed;
    private boolean clockLed;
    
	/**
	 * 
	 * @param time
	 */
	public void showHr(String time) {
		// TODO - implement Display.showHr
		
	}

	/**
	 * 
	 * @param time
	 */
	public void showAlarm(String time) {
		// TODO - implement Display.showAlarm
		
	}

	/**
	 * 
	 * @param clockLed
	 * @param alarmLed
	 * @param functionLed
	 */
	public void showLed(boolean showClock, boolean showAlarm, boolean showFunctionSet) {
		
            clockLed = showClock;
            alarmLed = showAlarm;
            functionLed = showFunctionSet;
            
		
	}

}