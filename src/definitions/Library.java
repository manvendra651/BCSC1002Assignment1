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

    @Override
    public String toString() {
        return "Library{" +
                "allBooksCurrentlyAvailable=" + Arrays.toString(allBooksCurrentlyAvailable) +
                '}';
    }
}
