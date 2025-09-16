class EMailChecker {
  public static void main(String[] args) {
    String adrs = "martin.doeb@dcewloop.com";
    int addLen = adrs.length();
    boolean hasAt = adrs.contains("@");

    if (hasAt && adrs.charAt(addLen - 4) == '.') {
      System.out.println("Send that email !");
    } else if (hasAt && (adrs.charAt(addLen - 3) == '.' || hasDotAfterAt(adrs))) {
      System.out.println("That's a correct email address");
    } else {
      if (!hasAt) {
        System.out.println("Your email is missing the '@'");
      } else {
        System.out.println("That's not a valid email");
      }
    }
  }

  static boolean hasDotAfterAt(String address) {
    int atPos = address.indexOf('@');
    String subString = address.substring(atPos);
    return subString.contains(".");
  }
}