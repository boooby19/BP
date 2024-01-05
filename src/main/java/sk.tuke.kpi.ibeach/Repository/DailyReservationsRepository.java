package sk.tuke.kpi.ibeach.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sk.tuke.kpi.ibeach.Entity.DailyReservations;
import sk.tuke.kpi.ibeach.Entity.ReservationRecord;

import java.util.Date;
import java.util.List;

@Repository
public interface DailyReservationsRepository extends CrudRepository<DailyReservations, Date> {

    List<DailyReservations> findAllByCourtNumberAndReservationDate(int courtNumber, Date reservationDate);

}
