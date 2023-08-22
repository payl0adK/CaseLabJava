public class Main {

  public static void main(String[] args) {
    String str = "abcba";
    System.out.println(isPalindrome(str));
  }

  public static boolean isPalindrome(String s) {
    int start = 0;
    int end = s.length() - 1;

    while (start < end) {
      if (s.charAt(start++) != s.charAt(end--)) {
        return false;
      }
    }
    return true;
  }
}
