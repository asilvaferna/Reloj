package reloj;

import java.time.LocalTime;

public class Botonera {

    private static boolean alarmActive;
    private static boolean setHour;
    private static boolean setAlarm;

    public static boolean alarmOn() {
        return alarmActive = true;

    }

    public static boolean alarmOff() {
        return alarmActive = false;

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
        alarmOff();

    }

}
