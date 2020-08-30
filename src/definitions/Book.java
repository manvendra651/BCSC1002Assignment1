/*  Created by IntelliJ IDEA.
 *  User: Manvendra Singh Rathore (manvendra651)
 *  Date: 29/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {
    private String bookName;
    private String authorName;
    private String thirteenDigitISBNNumber;

    public Book(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getThirteenDigitISBNNumber() {
        return thirteenDigitISBNNumber;
    }

    public void setThirteenDigitISBNNumber(String thirteenDigitISBNNumber) {
        this.thirteenDigitISBNNumber = thirteenDigitISBNNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookName, book.bookName) &&
                Objects.equals(authorName, book.authorName) &&
                Objects.equals(thirteenDigitISBNNumber, book.thirteenDigitISBNNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, authorName, thirteenDigitISBNNumber);
    }
}
