public class Main {

    public static void main(String[] args){

        // width of int = 32 (4 bytes)
        int myIntValue = 5 / 2; // numbers are automatically integers
        // width of float = 32 (4 bytes)
        float myFloatValue = 5f / 3;
        // width of double = 64 (8 bytes)
        double myDoubleValue = 5d / 3; // floating point numbers are automatically doubles

        System.out.println("myIntValue: " + myIntValue);
        System.out.println("myFloatNumber: " + myFloatValue);
        System.out.println("myDoubleValue: " + myDoubleValue);

        double numPounds = 200d;
        double convertedKilograms = numPounds * 0.45359237d;
        System.out.println("Kilograms: " + convertedKilograms);
        double pi = 3.1415927d;
    }

}
