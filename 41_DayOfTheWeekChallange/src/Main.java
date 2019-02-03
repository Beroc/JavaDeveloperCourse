public class Main {

    //Write a method with the name printDayOfTheWeek that has one parameter of type int and name it day.
    //
    //The method should not return any value (hint: void)
    //
    //Using a switch statement print "Sunday", "Monday", ... ,"Saturday" if the int parameter "day" is 0, 1, ... , 6 respectively, otherwise it should print "Invalid day".
    //
    //Bonus:
    //	Write a second solution using if then else, instead of using switch.
    //	Create a new project in IntelliJ with the  name ÅgDayOfTheWeekChallengeÅh

    public static void printDayOfTheWeek(int day){

        switch (day){

            case 0:
                System.out.println("Sunday");
                return;
            case 1:
                System.out.println("Monday");
                return;
            case 2:
                System.out.println("Tuesday");
                return;
            case 3:
                System.out.println("Wednesday");
                return;
            case 4:
                System.out.println("Thursday");
                return;
            case 5:
                System.out.println("Friday");
                return;
            case 6:
                System.out.println("Saturday");
                return;
            default:
                System.out.println("Invalid day");

        }

    }

    public static void ifElsePrintDayOfTheWeek(int day){

        if (day == 0){
            System.out.println("Sunday");
        } else if (day == 1){
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid day");
        }


    }

    public static void main(String[] args){


        printDayOfTheWeek(3);

        ifElsePrintDayOfTheWeek(6);

    }

}
