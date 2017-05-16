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
    public static LocalTime horaSistema;
    public static LocalTime horaAlarma;
    public static Timer timer;

    public Reloj() {
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        horaActual = LocalTime.of(12, 50);
        horaAlarma = LocalTime.of(0, 0);
        timer = new Timer();
        
        TimerTask task = new TimerTask(){
            @Override
            public void run() {
                if(horaAlarma.getMinute() == LocalTime.now().getMinute()) {
                    JOptionPane.showMessageDialog(null, "ALARMA!!!");
                } else {
                    
                }
            }
            
        };
        
        
        String mensaje1 = null, mensaje2 = null;
        mensaje1 = "====***RELOJ***===\n\n1. Configurar Hora\n2. Configurar Alarma\n" + "\n\n===Hora: " + Display.showHr(horaActual);
        mensaje2 = "===***CONFIGURAR HORA***===\n1. Aumentar Hora\n2. Aumentar Minutos" + "\n\n" + Display.showHr(horaActual);
        // switch case menu
        int opt = 0;
        opt = Integer.parseInt(JOptionPane.showInputDialog(mensaje1));
        while (opt != 5) {
            
            switch (opt) {
                case 1: // configurar hora
                    Botonera.configHour();
                    int opt1 = 0;
                    opt1 = Integer.parseInt(JOptionPane.showInputDialog(mensaje2));
                    while (opt1 != 3) {
                        switch (opt1) {
                            case 1: // aumentar hora
                                horaActual = Botonera.plusHr(horaActual);
                                break;
                            case 2: //aumentar minutos
                                horaActual = Botonera.plusMin(horaActual);
                                break;
                        }
                        opt1 = Integer.parseInt(JOptionPane.showInputDialog("===***CONFIGURAR HORA***===\n1. Aumentar Hora\n2. Aumentar Minutos" + "\n\n" + Display.showHr(horaActual)));
                    }

                    break;
                case 2: // configurar alarma
                    timer.schedule(task, 10, 10000);
                    Botonera.configAlarm();
                    int opt2 = 0;
                    opt2 = Integer.parseInt(JOptionPane.showInputDialog(mensaje2));
                    while (opt2 != 3) {
                        switch (opt2) {
                            case 1: // aumentar hora
                                horaAlarma = Botonera.plusHr(horaAlarma);
                                Botonera.alarmOn();
                                break;
                            case 2: //aumentar minutos
                                horaAlarma = Botonera.plusMin(horaAlarma);
                                Botonera.alarmOn();
                                break;
                        }
                        opt1 = Integer.parseInt(JOptionPane.showInputDialog("===***CONFIGURAR HORA***===\n1. Aumentar Hora\n2. Aumentar Minutos" + "\n\n" + Display.showHr(horaActual)));
                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
            opt = Integer.parseInt(JOptionPane.showInputDialog(mensaje1));
        }
        timer.cancel();
    }

}
