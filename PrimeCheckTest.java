import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrimeCheckTest {
  // --------------------------------------------------------------- //
  @Test
  public void TestNegativeNumbers() {
    for (int i = -10; i < 0; ++i) {
      assertEquals("Test negative number " + i, false, PrimeCheck.isPrime(i));
    }
  }

  // --------------------------------------------------------------- //
  @Test
  public void TestEdgeCases() {
    assertEquals("Test 0", false, PrimeCheck.isPrime(0));
    assertEquals("Test 1", false, PrimeCheck.isPrime(1));
    assertEquals("Test 2", true, PrimeCheck.isPrime(2));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testPrimes() {
    int[] primes = {3, 5, 7, 11, 13, 17, 19, 23, 29, 31};
    for (int p : primes) {
      assertEquals("Test prime " + p, true, PrimeCheck.isPrime(p));
    }
  }

  // --------------------------------------------------------------- //
  @Test
  public void testNonPrimes() {
    int[] nonPrimes = {4, 6, 8, 9, 10, 12, 14, 15, 16, 25};
    for (int n : nonPrimes) {
      assertEquals("Test non-prime " + n, false, PrimeCheck.isPrime(n));
    }
  }
}