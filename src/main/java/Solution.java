public class Solution {
  private int getNext(int n) {
    int sum = 0;
    while(n > 0) {
      int digit = n % 10;
      n /= 10;
      sum += digit*digit;
    }
    return sum;
  }
  public boolean isHappy(int n) {
    int slow = n, fast = getNext(n);
    while (fast != 1 && slow != fast) {
      slow = getNext(slow);
      fast = getNext(getNext(fast));
    }
    return fast == 1;
  }
}
