package UNIT_TESTING;

import Algorithms.Fibonacci.DummyFibonacci;
import org.junit.jupiter.api.*;

public class TestFibonacci {

    @BeforeAll
    public static void BeforeAll() {

    }

    @Test
    @DisplayName("Test Fibonacci")
    public void testFibonacci() {
        long result = DummyFibonacci.getFib(40);
        Assertions.assertEquals(102334155, result);
    }

    @BeforeEach
    public void BeforeEach() {

    }
}
