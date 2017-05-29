package reloj;

/**
 * Botonera class that handles the way that the user interacts with the app.
 */
import java.time.LocalTime;

public class Botonera {

    private static boolean alarmActive;
    private static boolean setHour;
    private static boolean setAlarm;

    /**
     * Checks if the alarm is on.
     *
     * @return true
     */
    public static boolean alarmOn() {
        return alarmActive = true;

    }

    /**
     * Checks if the alarm is off.
     *
     * @return false
     */
    public static boolean alarmOff() {
        return alarmActive = false;

    }

    /**
     * ConfigHour mode that turns the leds for this mode.
     */
    public static void configHour() {

        Display.showLed(true, false, true);

    }

    /**
     * ConfigAlarm mode that turns the leds for this mode.
     */
    public static void configAlarm() {
        Display.showLed(false, true, true);

    }

    /**
     * Adds 1 unit to the hour variable.
     * @param hora
     * @return hora + 1 unit
     */
    
    public static LocalTime plusHr(LocalTime hora) {

        return hora.plusHours(1);

    }
    
    /**
     * Adds 1 unit the minute variable
     * @param hora
     * @return minute + 1 unit
     */

    public static LocalTime plusMin(LocalTime hora) {
        return hora.plusMinutes(1);

    }

    /**
     * Sets the alarm off. This method calls to the alarmOff() method.
     */
    
    public static void stopAlarm() {
        alarmOff();

    }

}
