public class Main {
    public static class Book {
        int pages;
        boolean isRented;

        void checkIfRented() {
            if (isRented) {
                System.out.println("Book with " + pages + " pages is rented!");
            } else {
                System.out.println("Book with " + pages + " pages is available!");
            }
        }
    }
    
    public static void main(String[] args) {
        Book book = new Book();
        book.checkIfRented();
    }
}