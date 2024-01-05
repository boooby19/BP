package sk.tuke.kpi.ibeach.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "reservationRecords")
public class ReservationRecord
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "court_number", nullable = false)
    private int courtNumber;

    @ManyToOne
    private DailyReservations dailyReservations;

    @ManyToOne
//    @JoinColumn(name = "customer_id")
    private Customer customer;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "start_time", nullable = false)
    private Date startTime;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "end_time", nullable = false)
    private Date endTime;

    public ReservationRecord(Long id, int courtNumber, Customer customer, Date startTime, Date endTime) {
        this.id = id;
        this.courtNumber = courtNumber;
        this.customer = customer;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public ReservationRecord() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCourtNumber() {
        return courtNumber;
    }

    public void setCourtNumber(int courtNumber) {
        this.courtNumber = courtNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
