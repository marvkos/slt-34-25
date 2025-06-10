package at.technikum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void when_1_plus_1_then_sum_2() {
        // Arrange
        Calculator calculator = new Calculator();
        int a = 1;
        int b = 1;

        // Act
        int result = calculator.sum(a, b);

        // Assert
        assertEquals(2, result);
    }


}
