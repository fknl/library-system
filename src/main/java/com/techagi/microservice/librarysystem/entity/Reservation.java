package com.techagi.microservice.librarysystem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reservationId;

    private String bookId;
    private String studentId;
    private Date dateOut;
    private Date dateIn;

    public Reservation() {
    }

    public Reservation(String bookId, String studentId, Date dateOut) {
        this.bookId = bookId;
        this.studentId = studentId;
        this.dateOut = dateOut;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "bookId='" + bookId + '\'' +
                ", studentId='" + studentId + '\'' +
                ", dateOut=" + dateOut +
                ", dateIn=" + dateIn +
                '}';
    }

    public void setDateIn(Date dateIn) {
        this.dateIn = dateIn;
    }

    public String getBookId() {
        return bookId;
    }

    public String getStudentId() {
        return studentId;
    }

    public Date getDateOut() {
        return dateOut;
    }

    public Date getDateIn() {
        return dateIn;
    }

    public Long getReservationId() {
        return reservationId;
    }

    public void setReservationId(Long reservationId) {
        this.reservationId = reservationId;
    }
}
