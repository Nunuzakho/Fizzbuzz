package za.co.wethinkcode.student_performance_tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void returnsFizzWhenDivisibleByThree() {
        FizzBuzz fizzbuzz = new FizzBuzz();

        assertEquals("Fizz", fizzbuzz.process(3));
    }

    @Test
    void returnsBuzzWhenDivisibleByFive() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertEquals("Buzz", fizzBuzz.process(5));
    }

    @Test
    void returnsFizzBuzzWhenDivisibleByThreeAndFive() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertEquals("FizzBuzz", fizzBuzz.process(15));
    }

    @Test
    void returnsNumberWhenDivisibleByThreeAndFive() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertEquals("17", fizzBuzz.process(17));
    }
}
