/*  Created by IntelliJ IDEA.
 *  User: Manvendra Singh Rathore (manvendra651)
 *  Date: 29/08/20
 *  Time: 4:30 PM
 *  File Name : Library.java
 * */
package definitions;

public class Library {
    private Book[] allBooksCurrentlyAvailable;

    public Library(Book[] allBooksCurrentlyAvailable) {
        this.allBooksCurrentlyAvailable = allBooksCurrentlyAvailable;
    }

    public Book[] getAllBooksCurrentlyAvailable() {
        return allBooksCurrentlyAvailable;
    }

    public void setAllBooksCurrentlyAvailable(Book[] allBooksCurrentlyAvailable) {
        this.allBooksCurrentlyAvailable = allBooksCurrentlyAvailable;
    }
}
