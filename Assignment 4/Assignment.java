import java.util.*;

public class Assignment {
    public static void main(String args[]){
        //  Answer 1
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        String choice = (number > 0) ? "Positive" : "Negative";
        System.out.println("The number is " + choice);

        //  Answer 2
        double temp = 103.5;
        choice = (temp > 103.5) ? "Fever" : "Normal";
        System.out.println("The temperature is " + choice);

        //  Answer 3
        System.out.println("Enter a number: ");
        int no = sc.nextInt();
        switch(no){
            case 1 : System.out.println("Monday");
                        break;
            case 2 : System.out.println("Tuesday");
                        break;
            case 3 : System.out.println("Wednesday");
                        break;
            case 4 : System.out.println("Thursday");
                        break;
            case 5 : System.out.println("Friday");
                        break;
            case 6 : System.out.println("Saturday");
                        break;
            case 7 : System.out.println("Sunday");
                        break;
            default : System.out.println("Invalid Input");
        }

            //  Answer 5
            System.out.println("Enter the year: ");
            int year = sc.nextInt();
            if (year % 4 == 0){
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println("Leap Year");
                    } 
                }else if (year % 100 != 0) {
                    System.out.println("Leap Year");
                } else {
                        System.out.println("Not a Leap Year");
                }
            }
    }
}



