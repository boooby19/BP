package sk.tuke.kpi.ibeach.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;

    @Column(name = "meno", nullable = false)
    private String name;

    @Column(name = "priezvisko", nullable = false)
    private String lastName;

    @Column(name = "telephone", nullable = false)
    private String contactNumber;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<ReservationRecord> reservations;

    public Customer(Long customerId, String name, String lastName, String contactNumber, String email, List<ReservationRecord> reservations) {
        this.customerId = customerId;
        this.name = name;
        this.lastName = lastName;
        this.contactNumber = contactNumber;
        this.email = email;
        this.reservations = reservations;
    }

    public Customer() {

    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<ReservationRecord> getReservations() {
        return reservations;
    }

    public void setReservations(List<ReservationRecord> reservations) {
        this.reservations = reservations;
    }

}
