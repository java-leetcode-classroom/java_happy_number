import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private Solution sol = new Solution();
  @Test
  void isHappyExample1() {
    assertEquals(true, sol.isHappy(19));
  }
  @Test
  void isHappyExample2() {
    assertEquals(false, sol.isHappy(2));
  }
}