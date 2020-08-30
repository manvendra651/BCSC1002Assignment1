/*  Created by IntelliJ IDEA.
 *  User: Manvendra Singh Rathore (manvendra651)
 *  Date: 29/08/20
 *  Time: 06:00 PM
 *  File Name : Student.java
 * */
package definitions;

public class Student {
    private String[] nameOfStudentFormatFirstMiddleLast;
    private long universityRollNumber;
    private int numberOfBooksIssued;
    private Book[] nameOfBooksIssued;

    public Student(String[] nameOfStudentFormatFirstMiddleLast) {
        this.nameOfStudentFormatFirstMiddleLast = nameOfStudentFormatFirstMiddleLast;
    }

    public Student(long universityRollNumber) {
        this.universityRollNumber = universityRollNumber;
    }

    public Student(int numberOfBooksIssued) {
        this.numberOfBooksIssued = numberOfBooksIssued;
    }

    public Student(Book[] nameOfBooksIssued) {
        this.nameOfBooksIssued = nameOfBooksIssued;
    }
}
