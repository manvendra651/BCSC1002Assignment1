/*  Created by IntelliJ IDEA.
 *  User: Manvendra Singh Rathore (manvendra651)
 *  Date: 29/08/20
 *  Time: 4:30 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    private Book[] allBooksCurrentlyAvailable;

    public Library() {
        this.allBooksCurrentlyAvailable = new Book[1000];
        this.allBooksCurrentlyAvailable = new Book[10];
        for (int index = 0; index < allBooksCurrentlyAvailable.length; index++) {
            allBooksCurrentlyAvailable[index] = new Book("Books" + (index + 1));
        }
    }

    public Library(Book[] allBooksCurrentlyAvailable) {
        this.allBooksCurrentlyAvailable = allBooksCurrentlyAvailable;
    }

    public Book[] getAllBooksCurrentlyAvailable() {
        return allBooksCurrentlyAvailable;
    }

    public void setAllBooksCurrentlyAvailable(Book[] allBooksCurrentlyAvailable) {
        this.allBooksCurrentlyAvailable = allBooksCurrentlyAvailable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(allBooksCurrentlyAvailable, library.allBooksCurrentlyAvailable);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(allBooksCurrentlyAvailable);
    }

    public void listOfBooksIssued() {
        for (Book book : allBooksCurrentlyAvailable) {
            System.out.println(book);
        }
    }
    public void returnedBook(String bookName) {
        System.out.println(bookName + " has been returned successfully . ");
    }

    @Override
    public String toString() {
        return "Library{" +
                "allBooksCurrentlyAvailable=" + Arrays.toString(allBooksCurrentlyAvailable) +
                '}';
    }

    public void issuedBook() {
    }
}
