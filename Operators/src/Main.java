public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result +1;
        System.out.println("Result is now: " + result);
        result++;
        System.out.println("Result is now: " + result);
        result--;
        System.out.println("Result is now: " + result);

        result += 2;
        System.out.println("Result is now: " + result);
        result *= 10;
        System.out.println("Result is now: " + result);
        result -= 10;
        System.out.println("Result is now: " + result);
        result /= 10;
        System.out.println("Result is now: " + result);

        boolean isAlient = false;
        if (isAlient == false){
            System.out.println("Is not an alient!");
        }

        int topScore = 100;
        if(topScore != 100){
            System.out.println("You got the highscore");
        }

        // < <= > >= = == !=

        int secoundTopScore = 60;
        if(topScore > secoundTopScore && topScore < 100){
            System.out.println("Greater than secound top and less than a 100");
        }

    }

}
