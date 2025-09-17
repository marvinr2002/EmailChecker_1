class ls {
  static boolean isFile(String elem) {
    // Check that the first 3 characters of the element contain /f as a substring
    return elem.substring(0, 3).contains("/f");
  }
  
  static boolean isHidden(String elem) {
    // Use the appropriate method to make sure that file is hidden
    return elem.contains(".");
  }

  static boolean isNonLocal(String elem) {
    // Use the correct method to determine whether a file is in a directory
    return elem.substring(3, elem.length()).contains("/");
  }

  public static void main(String[] args) {
    int hiddenCounter = 0, directoryCounter = 0, nestedCounter = 0;
    for (String elem : DIRECTORY_CONTENT) {
      if (isFile(elem)) {
        if (!isHidden(elem)) System.out.print(elem.substring(2));
          // Use a logical operator to make it correct
        else if (isHidden(elem) && !isNonLocal(elem)) hiddenCounter++;
        else nestedCounter++;
      } else directoryCounter++;
    }
    printer(hiddenCounter, directoryCounter, nestedCounter);
  }

  static String[] DIRECTORY_CONTENT = {"/d .Trash", "/f .history", "/d Applications", "/f tmp", "/f script", "/d Documents", "/f Documents/.bankAccounts", "/f .sshKeys", "/d Pictures", "/f content", "/f Documents/file"};

  static void printer(int hiddenCounter, int directoryCounter, int nestedCounter) {
    System.out.println();
    System.out.println("With :\n" + hiddenCounter + " hidden files,\n" + directoryCounter + " directories,\nAnd " + nestedCounter + " nested files");
  }
}