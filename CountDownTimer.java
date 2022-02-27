
import java.util.Scanner;
import java.util.Timer;
// import java.util.TimerTask;
import java.util.TimerTask;

public class ContDownTimer {

    static int time = 0;
    static int hours = 0;
    static int minutes = 0;
    static int seconds = 0;
    static String hours_string = String.format("%02d", hours);
    static String minutes_string = String.format("%02d", minutes);
    static String seconds_string = String.format("%02d", seconds);
    static String time_String = hours_string + " : " + minutes_string + " : " + seconds_string;

    public static void main(String[] args) throws InterruptedException {

        display();
    }

    static void input() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the time in \nHH:MM:SS FOMRAT");
        hours = input.nextInt();
        minutes = input.nextInt();
        seconds = input.nextInt();

        System.out.println("ENTER 0 TO START.\n");
        int control = input.nextInt();

        time = hours * 60 * 60 * 1000 + minutes * 60 * 1000 + seconds * 1000;
        input.close();
        boolean started = false;
        if (control == 0) {

            if (started == false) {
                started = true;
                // startButton.setText("STOP");
                start();
            }

            else {
                started = false;
                // startButton.setText("START");
                stop();
            }

        }

        if (control == 1) {
            started = false;
            // startButton.setText("START");
            reset();
        }

    }

    static void start() {
        // timer.start();
    }

    static void stop() {
        // timer.stop();
    }

    static void reset() {
        // timer.stop();
        time = 0;
        seconds = 0;
        minutes = 0;
        hours = 0;
        seconds_string = String.format("%02d", seconds);
        minutes_string = String.format("%02d", minutes);
        hours_string = String.format("%02d", hours);

    }

    static void display() throws InterruptedException {

        input();
        // Timer timer = new Timer(1000);
        for (int i = 1; i <= time + 1000; i++) {

            hours = (time / 3600000);
            minutes = (time / 60000) % 60;
            seconds = (time / 1000) % 60;
            seconds_string = String.format("%02d", seconds);
            minutes_string = String.format("%02d", minutes);
            hours_string = String.format("%02d", hours);
            System.out.println(hours_string + " : " + minutes_string + " : " + seconds_string);
            time -= 1000;
            Thread.sleep(1000);
        }
        System.out.println("TIME'S UP");
    }

}
