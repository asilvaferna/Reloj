/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj;

import java.time.LocalTime;
import javax.swing.JOptionPane;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Adri
 */
public class Reloj {

    public static LocalTime horaActual;
    public static LocalTime horaAlarma;
    public static Timer timer;

    public Reloj() {

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        horaActual = LocalTime.of(9, 00);
        horaAlarma = LocalTime.of(0, 0);
        timer = new Timer();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                if (horaAlarma == horaActual) {
                    JOptionPane.showMessageDialog(null, "ALARMA!!!");
                }
            }

        };

        // switch case menu
        int opt = 0;
        opt = Integer.parseInt(JOptionPane.showInputDialog("====***RELOJ***===\n\n1. Configurar Hora\n2. Configurar Alarma\n3. Parar Alarma\n4. Salir" + "\n\n===Hora: " + Display.showHr(horaActual)));
        while (opt != 4) {

            switch (opt) {
                case 1: // configurar hora
                    Botonera.configHour();
                    int opt1 = 0;
                    opt1 = Integer.parseInt(JOptionPane.showInputDialog("===***CONFIGURAR HORA***===\n1. Aumentar Hora\n2. Aumentar Minutos\n3. Menú Principal" + "\n\n" + Display.showHr(horaActual)));
                    while (opt1 != 3) {
                        switch (opt1) {
                            case 1: // add hours
                                horaActual = Botonera.plusHr(horaActual);
                                break;
                            case 2: // add minutes
                                horaActual = Botonera.plusMin(horaActual);
                                break;
                        }
                        opt1 = Integer.parseInt(JOptionPane.showInputDialog("===***CONFIGURAR HORA***===\n1. Aumentar Hora\n2. Aumentar Minutos\n3. Menú Principal" + "\n\n" + Display.showHr(horaActual)));
                    }
                    break;
                case 2: // alarm configuration

                    Botonera.configAlarm();
                    int opt2 = 0;
                    opt2 = Integer.parseInt(JOptionPane.showInputDialog("===***CONFIGURAR ALARMA***===\n1. Aumentar Hora\n2. Aumentar Minutos\n3. Activar Alarma\n4. Menú Principal" + "\n\n" + Display.showHr(horaAlarma)));
                    while (opt2 != 4) {
                        switch (opt2) {
                            case 1: // add hours
                                horaAlarma = Botonera.plusHr(horaAlarma);
                                Botonera.alarmOn();
                                break;
                            case 2: // add minutes
                                horaAlarma = Botonera.plusMin(horaAlarma);
                                Botonera.alarmOn();
                                break;
                            case 3: // turn on alarm
                                timer.schedule(task, 10, 10000);
                                Botonera.alarmOn();

                                break;
                        }
                        opt2 = Integer.parseInt(JOptionPane.showInputDialog("===***CONFIGURAR ALARMA***===\n1. Aumentar Hora\n2. Aumentar Minutos\n3. Activar Alarma\n4. Menú Principal" + "\n\n" + Display.showHr(horaAlarma)));
                    }
                    break;
                case 3: // stop alarm
                    Botonera.stopAlarm(); // 
                    timer.cancel();
                    break;
            }
            opt = Integer.parseInt(JOptionPane.showInputDialog("====***RELOJ***===\n\n1. Configurar Hora\n2. Configurar Alarma\n3. Parar Alarma\n4. Salir" + "\n\n===Hora: " + Display.showHr(horaActual)));
        }
        timer.cancel();
    }

}
