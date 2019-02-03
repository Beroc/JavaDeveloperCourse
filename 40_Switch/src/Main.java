public class Main {

    public static void main(String[] args){
//        int value = 1;
//        if (value == 1){
//            System.out.println("Value was 1");
//        } else if (value == 2){
//            System.out.printf("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

        int switchValue = 3;

        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Was a 3, or 4, or 5");
                System.out.println("Actually is was a " + switchValue);
                break;

            default:
                System.out.println("Value was not 1 or 2");
        }

        // Create a new switch statement using char instead of int
        // create a new char variable
        // create a switch statement testing for
        // A, B, C, D, or E
        // display a message if any of these are found and then break
        // Add a default which displays a message saying not found

        char switchVariable = 'A';

        switch (switchVariable){
            case 'A':
                System.out.println("Char is " + switchVariable);
                break;
            case 'B':
                System.out.println("Char is " + switchVariable);
                break;
            case 'C':
                System.out.println("Char is " + switchVariable);
                break;
            case 'D':
                System.out.println("Char is " + switchVariable);
                break;
            case 'E':
                System.out.println("Char is " + switchVariable);
                break;
            default:
                System.out.println("Char not found");
        }


        String month = "january";

        switch (month.toLowerCase()){ // switch is case sensitive, so add toLowerCase Method to surround the case sensitivity
            case "January":
                System.out.println("Jan");
            case "June":
                System.out.println("Jun");
            default:
                System.out.println("Not sure");
        }

    }

}
