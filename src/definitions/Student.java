/*  Created by IntelliJ IDEA.
 *  User: Manvendra Singh Rathore (manvendra651)
 *  Date: 29/08/20
 *  Time: 06:00 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

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

    public String[] getNameOfStudentFormatFirstMiddleLast() {
        return nameOfStudentFormatFirstMiddleLast;
    }

    public void setNameOfStudentFormatFirstMiddleLast(String[] nameOfStudentFormatFirstMiddleLast) {
        this.nameOfStudentFormatFirstMiddleLast = nameOfStudentFormatFirstMiddleLast;
    }

    public long getUniversityRollNumber() {
        return universityRollNumber;
    }

    public void setUniversityRollNumber(long universityRollNumber) {
        this.universityRollNumber = universityRollNumber;
    }

    public int getNumberOfBooksIssued() {
        return numberOfBooksIssued;
    }

    public void setNumberOfBooksIssued(int numberOfBooksIssued) {
        this.numberOfBooksIssued = numberOfBooksIssued;
    }

    public Book[] getNameOfBooksIssued() {
        return nameOfBooksIssued;
    }

    public void setNameOfBooksIssued(Book[] nameOfBooksIssued) {
        this.nameOfBooksIssued = nameOfBooksIssued;
    }
    @Override
    public String toString() {
        return "Student{" +
                "nameOfStudentFormatFirstMiddleLast=" + Arrays.toString(nameOfStudentFormatFirstMiddleLast) +
                ", universityRollNumber=" + universityRollNumber +
                ", numberOfBooksIssued=" + numberOfBooksIssued +
                ", nameOfBooksIssued=" + Arrays.toString(nameOfBooksIssued) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return universityRollNumber == student.universityRollNumber &&
                numberOfBooksIssued == student.numberOfBooksIssued &&
                Arrays.equals(nameOfStudentFormatFirstMiddleLast, student.nameOfStudentFormatFirstMiddleLast) &&
                Arrays.equals(nameOfBooksIssued, student.nameOfBooksIssued);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(universityRollNumber, numberOfBooksIssued);
        result = 31 * result + Arrays.hashCode(nameOfStudentFormatFirstMiddleLast);
        result = 31 * result + Arrays.hashCode(nameOfBooksIssued);
        return result;
    }


}
