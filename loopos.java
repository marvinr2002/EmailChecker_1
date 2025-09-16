package out;
class CharacterCounter {
  public static void main(String[] args) {
    String[] conjugation = {"hide", "hindered", "hiding", "hidden", "hindering", "hid", "hides", "hinder"};
    // Retrieve the number of words in the array by calling the correct field
    int tabLength = conjugation.length;
    int numberOfCharacters = 0;

    // Choose the appropriate operators (logical and increment)
    for (int i = 0; i < tabLength; i++) {
      // Give the proper variable to get each word out of conjugation
      String word = conjugation[i];
      numberOfCharacters += word.length();
    }
    System.out.println("There are " + numberOfCharacters + "characters in the list");
  }
}
class Speller {
  public static void main(String[] args) {
    String toSpell = "conscientious";

    // Choose the correct method on toSpell to retrieve its length
    int wordLength = toSpell.length();

    // Use the right keyword and put the starting correct value into i
    for (int i = 0; i < wordLength; i++) {
      // Write down the correct method to retrieve the character at the ith position
      System.out.println(toSpell.charAt(i));
    }
    String weather = "Windy";
    switch (weather) {
  case "Windy":
    System.out.println("Take an umbrella");
    break;
  case "Sunny":
    System.out.println("Don't forget your sunscreen");
    break;
  case "Cloudy":
    System.out.println("The umbrella might be great");
    break;
  default:
    System.out.println("I don't know what the weather will be like");
    break;
    
}
  }
}

