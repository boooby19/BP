package sk.tuke.kpi.ibeach.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import sk.tuke.kpi.ibeach.Entity.Customer;
import sk.tuke.kpi.ibeach.Entity.ReservationRecord;
import sk.tuke.kpi.ibeach.Repository.ReservationRecordRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ReservationRecordService {

    @Autowired
    private ReservationRecordRepository reservationRecordRepository;

    public ReservationRecord createReservation(int courtNumber, Customer customer, Date startTime, Date endTime)
    {
        ReservationRecord reservation = new ReservationRecord();
        reservation.setCourtNumber(courtNumber);
        reservation.setCustomer(customer);
        reservation.setStartTime(startTime);
        reservation.setEndTime(endTime);
        return reservationRecordRepository.save(reservation);
    }

    public boolean deleteReservation(Long id)
    {
        try
        {
            reservationRecordRepository.deleteById(id);
            return true;
        } catch(IllegalArgumentException e)
        {
            return false;
        }
    }

    public ReservationRecord updateReservationRecord(Long id, int courtNumber, Customer customer, Date startTime, Date endTime)
    {
        ReservationRecord reservation = reservationRecordRepository.findById(id).orElseThrow(IllegalArgumentException::new);
        reservation.setCourtNumber(courtNumber);
        reservation.setCustomer(customer);
        reservation.setStartTime(startTime);
        reservation.setEndTime(endTime);
        return reservationRecordRepository.save(reservation);
    }

    public List<ReservationRecord> findReservationsByCustomer(@PathVariable Customer customer){
        return reservationRecordRepository.findAllByCustomer(customer);
    }

    public ReservationRecord findReservationById(@PathVariable Long id){
        return reservationRecordRepository.findById(id).orElseThrow(IllegalArgumentException::new);
    }

    public Iterable<ReservationRecord> findReservations() {
        return reservationRecordRepository.findAll();
    }
}
