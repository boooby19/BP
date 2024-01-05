package sk.tuke.kpi.ibeach.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "daily_reservations")
public class DailyReservations
{
    @Column(name = "court_number", nullable = true)
    private int courtNumber;

    @Id
    @Temporal(TemporalType.DATE)
    @Column(name = "day", nullable = false)
    private Date reservationDate;

    @OneToMany(mappedBy = "dailyReservations", cascade = CascadeType.ALL)
    public List<ReservationRecord> listOfDailyReservations = new ArrayList<>();

    public DailyReservations(int courtNumber, Date reservationDate, List<ReservationRecord> listOfDailyReservations) {
        this.courtNumber = courtNumber;
        this.reservationDate = reservationDate;
        this.listOfDailyReservations = listOfDailyReservations;
    }

    public DailyReservations() {

    }

    public int getCourtNumber() {
        return courtNumber;
    }

    public void setCourtNumber(int courtNumber) {
        this.courtNumber = courtNumber;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public List<ReservationRecord> getListOfDailyReservations() {
        return listOfDailyReservations;
    }

    public void setListOfDailyReservations(List<ReservationRecord> listOfDailyReservations) {
        this.listOfDailyReservations = listOfDailyReservations;
    }
}

