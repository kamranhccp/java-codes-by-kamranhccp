//Average Speed in Kilometer per Hour by IG@kamran_hccp
import java.util.Scanner;
public class AverageSpeedProgramme {
    public static void main(String [] args){
        //Average Speed in Kilometer/Hour
        
        //input
        Scanner input = new Scanner(System.in);
        System.out.print("Do you want to enter Displacement in " +
                "\n" +
                "1: Kilometer." +
                "\n" +
                "2: Milles." +
                "\n" +
                "Enter your option: ");
        double input_disp_option = input.nextDouble();

        System.out.print("Enter Displacement: ");
        double input_disp = input.nextDouble();

        System.out.println(); //for one line gap

        System.out.print("Do you want to enter Time in " +
                "\n" +
                "1: Seconds." +
                "\n" +
                "2: Minutes." +
                "\n" +
                "3: Hours." +
                "\n" +
                "Enter your option: ");
        double input_time_option = input.nextDouble();

        System.out.print("Enter Time: ");
        double input_time = input.nextDouble();

        System.out.println(); //for one line gap


        /*Get time input from user in sec min or hour */
        double sec_time = 1.0;
        double min_time = 1.0;
        double timeSectoHour = sec_time / 3600;
        double timemintoHour = min_time / 60;

        /*Get displacement input in milles or KM as user wants*/
        double disp_milles = 1.0;
        double millestoKM = disp_milles * 1.6;


        //Average speed
        if (input_disp_option == 1 && input_time_option == 1){
            System.out.print("Average Speed in Km/h is " + ((input_disp) / (input_time * timeSectoHour)) + ".");
        }
        else if (input_disp_option == 1 && input_time_option == 2){
            System.out.print("Average Speed in Km/h is " + ((input_disp) / (input_time * timemintoHour)) + ".");
        }
        else if (input_disp_option == 1 && input_time_option == 3){
            System.out.print("Average Speed in Km/h is " + ((input_disp) / (input_time)) + ".");
        }

        else if (input_disp_option == 2 && input_time_option == 1){
            System.out.print("Average Speed in Km/h is " + ((input_disp * millestoKM) / (input_time * timeSectoHour)) + ".");
        }
        else if (input_disp_option == 2 && input_time_option == 2){
            System.out.print("Average Speed in Km/h is " + ((input_disp * millestoKM) / (input_time * timemintoHour)) + ".");
        }
        else if (input_disp_option == 2 && input_time_option == 3){
            System.out.print("Average Speed in Km/h is " + ((input_disp * millestoKM) / (input_time)) + ".");
        }
        else {
            System.out.print("Wrong Input!");
        }

    }
}
//Average Speed in Kilometer per Hour by IG@kamran_hccp

