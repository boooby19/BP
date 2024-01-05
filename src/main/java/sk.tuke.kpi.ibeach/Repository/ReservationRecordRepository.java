package sk.tuke.kpi.ibeach.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sk.tuke.kpi.ibeach.Entity.Customer;
import sk.tuke.kpi.ibeach.Entity.ReservationRecord;

import java.util.List;

@Repository
public interface ReservationRecordRepository extends CrudRepository<ReservationRecord, Long> {

    List<ReservationRecord> findAllByCustomer(Customer customer);

}
