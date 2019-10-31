package labseven.computation;

/**
 * IterativeFibonacci -
 *   A recursive program for computing the valueth
 *   Fibonacci number. The Fibonacci numbers
 *   are generated by starting with the numbers
 *   1 and 1, and then successively adding
 *   the two previous numbers in the sequence.
 *
 *   <p>1, 1, 2, 3, 5, 8, 13, 21, ...
 *
 *   <p>A recursive definition of the Fibonacci
 *   sequence is:
 *
 *   <p>fib(n) = 1                   if n <= 2
 *             = fib(n-1) + fib(n-2) if n < 2.
 *
 * @author Grant William Braught
 * @author Gregory M. Kapfhamer
 */
public class IterativeFibonacciComputation extends FibonacciComputation {

  /** Configure the name of the arithmetic computation. */
  public IterativeFibonacciComputation() {
    // TODO: Give the name of this computation
  }

  /**
   * Iteratively calculate the valueth Fibonacci number using longs.
   *
   * @param value indicates which Fibonacci number to compute.
   * @return the valueth Fibonacci number.
   */
  public long compute(int value) {
    long requestedFibonacciValue = 1;
    // Zero Case:
    // If value == 0 then fib(value) = 0.
    if (value == 0) {
      // TODO: return the correct value
    } else if (value <= 2) {
      // Base Case:
      // If value <= 2 then fib(value) = 1.
      // TODO: return the correct value
    } else {
      // "Recursive" Case: iteratively compute
      // TODO: use a loop to iteratively compute
      // TODO: I preserved the label of "recursive" case
      // so that this approach mirrors the recursive one.
      // But, as a reminder, you should write a loop!
    }
    return requestedFibonacciValue;
  }

}
