package Question_1;

import java.util.Scanner;

public class BookManagementSystem {
    public static void main(String[] args)  {

        Library library = new Library();

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Library Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Replace Book");
            System.out.println("4. Search for Book");
            System.out.println("5. Display Books");
            System.out.print("Enter your choice: ");
            skipLine();
            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                   skipLine();
                   
                   System.out.println("Type book ID(numbers only) and press Enter ");
                   
                   
                   int bookID = scanner.nextInt();
                   scanner.nextLine();
                   
                   System.out.println("Type Name of the book and press Enter ");
                   String title = scanner.nextLine();
                   System.out.println("Type Author of the book and press Enter ");
                   String author = scanner.nextLine();
                   System.out.println("Type y if book is available n if not and press Enter ");
                   String avail = scanner.nextLine();

                   boolean isbookAvailable = true;

                   if(avail.equals("y")){
                    isbookAvailable = true;

                   }else if(avail.equals("n")){
                    isbookAvailable = false;
                   }
                   
                   Book currentBook = new Book(bookID, title, author, isbookAvailable);

                   library.addBook(currentBook);

                   System.out.println("Your book is successfully added");
                   System.out.println("press y and enter to return to menu");
                   scanner.next();
                   
                   skipLine();
                   break;

                case 2:

                   skipLine();
                   System.out.println("please enter the ID of the book you want to remove");
                   int a = scanner.nextInt();
                   skipLine();

                   library.removeBook(a);
                   skipLine();;
                   break;
                   
                   
                case 3:
                   skipLine();

                   System.out.println("type the old book ID you want to replace and press enter");
                   int oldBookID = scanner.nextInt();
                   scanner.nextLine();

                   System.out.println("type the new book ID you want to add and press enter");
                   int bookID_1 = scanner.nextInt();
                   scanner.nextLine();

                   System.out.println("type the title of the book you want to add and press enter");
                   String title_1 = scanner.nextLine();

                   System.out.println("type the author name of the book you want to add and press enter");
                   String author_1 = scanner.nextLine();

                   System.out.println("type y if the book is available, type n if not and press enter");
                   String avail_1 = scanner.nextLine();
                   skipLine();

                   boolean isbookAvailable_1 = true;

                   if(avail_1.equals("y")){
                    isbookAvailable = true;

                   }else if(avail_1.equals("n")){
                    isbookAvailable = false;
                   }
                   
                   Book currentBook_1 = new Book(bookID_1, title_1, author_1, isbookAvailable_1);

                   library.replaceBook(oldBookID, currentBook_1);
                   skipLine();

                   break;
                   
                case 4:
                   skipLine();
                   System.out.println("please enter the ID of book you're looking for");
                   int bookID_2 = scanner.nextInt();
                   library.searchBook(bookID_2);
                   skipLine();
                   break;   

                case 5:
                   library.displayBooks();
                   
                   skipLine();

                   System.out.println("press y and enter to return to menu");
                   scanner.next();

                   skipLine();
                   break;   


                default:
                   scanner.close();
                   return;   
            }
        }

        
        }


    public static void skipLine(){
        System.out.println();
    }
}
