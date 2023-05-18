package za.co.wethinkcode.student_performance_tests;

import java.util.ArrayList;

public class FizzBuzz {

    static String process(int number){
            boolean divisibleBy3 = number % 3 == 0;
            boolean divisibleBy5 = number % 5 == 0;

            if ( divisibleBy3 && divisibleBy5 ) {
                return "FizzBuzz";
            }
            else if(divisibleBy3){
                return "Fizz";
            }
            else if(divisibleBy5){
                return "Buzz";
            }
            return String.valueOf(number);
        }

    public static void main(String[] args){
        for (int i = 1; i <= 100; i++){
            String msg = String.valueOf(i) + " is " + process(i); // HINT: implement this process() function
            System.out.println(msg);
        }
    }
}
