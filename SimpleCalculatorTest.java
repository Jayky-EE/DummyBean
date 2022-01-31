import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class SimpleCalculatorTest {

    /**
     * Unit testing for addition function in calculator.
     * @author Matt De Binion
     */
    @Nested
    class testAddition {

        Random rand = new Random();

        @DisplayName("Add two random integers together")
        @RepeatedTest(value = 5, name = "Random, positive numbers: test {currentRepetition} of {totalRepetitions}")
        void testPositiveNumbers() {

            int randNumOne = rand.nextInt(Integer.MAX_VALUE);
            int randNumTwo = rand.nextInt(Integer.MAX_VALUE);

            SimpleCalculator.addition(randNumOne, randNumTwo);
        }

        @DisplayName("Add two negative integers together")
        @RepeatedTest(value = 5, name = "Random, negative numbers: test {currentRepetition} of {totalRepetitions}")
        void testNegativeNumbers() {

            int randNumOne = rand.nextInt(Integer.MAX_VALUE) * -1;
            int randNumTwo = rand.nextInt(Integer.MAX_VALUE) * -1;

            SimpleCalculator.addition(randNumOne, randNumTwo);
        }

        @DisplayName("Add two random numbers together")
        @RepeatedTest(value = 10, name = "Random numbers: test {currentRepetition} of {totalRepetitions}")
        void testRandomNumbers() {

            int randNumOne = rand.nextInt(Integer.MAX_VALUE) * (rand.nextBoolean() ? -1 : 1);
            int randNumTwo = rand.nextInt(Integer.MAX_VALUE) * (rand.nextBoolean() ? -1 : 1);

            SimpleCalculator.addition(randNumOne, randNumTwo);
        }
        

    }

    @Test
    void testDivide() {

    }

    @Test
    void testMultiply() {

    }

    @Test
    void testSubtraction() {

    }
}
