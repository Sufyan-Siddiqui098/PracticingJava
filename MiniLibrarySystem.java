package CollectionPractice;

import java.util.*;

public class MiniLibrarySystem {
    /*
    Design a basic library system using Map<String, List<String>> where:
    Key = Author name
    Value = List of book titles
    Implement methods to:
    Add book
    Get books by author
    Remove book by title
    */

    public static void main(String[] args) {
        Map<String, List<String>> booksByAuthor = new LinkedHashMap<>();

        booksByAuthor.put("David", Arrays.asList("Book 1", "Book 2", "Book 3", "Book 4"));
        booksByAuthor.put("Henry", Arrays.asList("Book 3", "Book 4", "Book 5", "Book 6"));
        booksByAuthor.put("Stark", Arrays.asList("Book 7", "Book 8", "Book 9"));
        booksByAuthor.put("Coleman", Arrays.asList("Book 10", "Book 11", "Book 12", "Book 13"));

        System.out.println("--------- WELCOME TO MINI LIBRARY -------------\n");
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        while(running){
            System.out.println("Select an Option: ");
            System.out.println("1. Add Book\n2. Get Books by Author\n3. Remove Book\n4. Exit");
            System.out.print("Enter Option number (1-4) : ");

            int optionNumber = Integer.parseInt(sc.nextLine());

            switch (optionNumber){
                // Add Book - Author & Book title
                case 1 ->{
                    System.out.print("Enter Book Title: ");
                    String bookTitle = sc.nextLine();
                    System.out.print("Enter Author of Book: ");
                    String authorName = sc.nextLine();

                    addBook(authorName, bookTitle, booksByAuthor);
                    System.out.println("Book is added ");
                    System.out.println(booksByAuthor);
                    System.out.println();
                }
                case 2 ->{
                    System.out.print("Enter Author to get available list of books: ");
                    String authorName = sc.nextLine();
                    List<String> byAuthor = getBooksByAuthor(authorName, booksByAuthor);
                    System.out.println(" ---- List of Books by "+ authorName +" --- ");
                    System.out.println(byAuthor);
                    System.out.println();
                }

                case 3 -> {
                    System.out.print("Enter Book Title to remove from list: ");
                    String bookTitle = sc.nextLine();
                    removeBookByTitle(bookTitle, booksByAuthor);
                    System.out.println("Book is removed. ");
                    System.out.println(booksByAuthor);
                    System.out.println();
                }
                case 4 -> {
                    running = false;
                    System.out.println("Exiting the program.");
                }
                default -> {
                    System.out.println("Invalid Option");

                }
            }

        }



    }

    // Remove Book
    public static void removeBookByTitle(String title, Map<String, List<String>> booksByAuthor) {
        Set<Map.Entry<String, List<String>>> entries = booksByAuthor.entrySet();

        for(Map.Entry<String, List<String>> entry : entries){
            entry.setValue(entry.getValue().stream().filter(book -> !book.equals(title)).toList());
        }

        System.out.println("The Book : " + title + " is removed. " );
    }

    // Add Book
    public static void addBook(String author, String bookTitle, Map<String, List<String>> booksByAuthor){
        Set<Map.Entry<String, List<String>>> entries = booksByAuthor.entrySet();

        for(Map.Entry<String, List<String>> entry: entries){
            if(entry.getKey().equals(author)){
                //  List<String> value = entry.getValue(); // --- Wrong way -- immutable
                List<String> value = new ArrayList<>(entry.getValue());
                value.add(bookTitle);
                entry.setValue(value);
            }
        }
    }

    // Get Books by Author
    public static List<String> getBooksByAuthor (String author, Map<String, List<String>> booksByAuthor){
        return (List<String>) booksByAuthor.get(author);
    }

}


