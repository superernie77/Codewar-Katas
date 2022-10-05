import org.junit.jupiter.api.Test;
import katas.Multiply;
import static org.junit.jupiter.api.Assertions.assertEquals;

// TODO: Replace examples and use TDD by writing your own tests

class MultiplyTest {
    @Test
    void testSomething() {
      assertEquals(null, Multiply.multiply(null,2.0));
      assertEquals(null, Multiply.multiply(null,2.0));
      assertEquals(6, Multiply.multiply(3.0,2.0));
    }
}