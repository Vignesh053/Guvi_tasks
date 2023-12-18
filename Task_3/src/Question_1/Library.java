package Question_1;

public class Library {
    private Book[] books;

    public Library(){
        this.books = new Book[5];
    }


    public void addBook(Book book){
        
        
        for (int i = 0; i < books.length; i++) {
            if(books[i] == null){
                books[i] = book;
                return;
            }
        }

        System.out.println("There is no space in library to add a new book");
        System.out.println("");
        System.out.println("Try to remove or replace any other book on the library to add new one");
        System.out.println();
        System.out.println("Sorry for the inconvenience");
        

    }

    public void removeBook(int bookID){

        

        for (int i = 0; i < books.length; i++) {
            if (books[i].getBookID() == bookID ) {
                books[i] = null;
                for (int j = i; j < books.length - 1; j++) {
                    books[j] =  books[j+1];
                    
                }

                books[books.length - 1] = null;
                System.out.println("The book with ID " + bookID + " removed successfully");
                return;
            }
        }

        System.out.println("The book you're trying to find is not found");
        System.out.println();

    }

    public void searchBook(int bookID){

        for (int i = 0; i < books.length; i++) {
            if (books[i].getBookID() == bookID) {
                System.out.println("Book ID : " + books[i].getBookID() ); 
                System.out.println("Book Title : " + books[i].getTitle());
                System.out.println("Author : " + books[i].getAuthor());
                System.out.println("Book is " + (books[i].getIsAvailable()?"Available" : "Not Available"));
                System.out.println();
                return;
            }
        }

        System.out.println("The book You're trying to search is not found!");
        System.out.println();

    }

    

    public void replaceBook (int bookID, Book newBook){
        for (int i = 0; i < books.length; i++) {
            
            if(books[i].getBookID() == bookID){
                books[i] = newBook;
                System.out.println("the book you've added is succesfully replaced");
                System.out.println();
                return;
            }

        }

        System.out.println("Book you're trying to find with bookID is not found");
        System.out.println();

    }

    public void displayBooks(){
        for (int i = 0; i < books.length; i++) {
            if(books[i] != null){
                System.out.println("Book ID : " + books[i].getBookID() ); 
                System.out.println("Book Title : " + books[i].getTitle());
                System.out.println("Author : " + books[i].getAuthor());
                System.out.println("Book is " + (books[i].getIsAvailable() ?"Available" : "Not Available"));
                System.out.println();
                System.out.println();
            }
        }

    }


}
