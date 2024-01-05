package sk.tuke.kpi.ibeach.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import sk.tuke.kpi.ibeach.Entity.DailyReservations;
import sk.tuke.kpi.ibeach.Repository.DailyReservationsRepository;

import java.util.Date;
import java.util.List;

@Service
public class DailyReservationsService {

    @Autowired
    private DailyReservationsRepository dailyReservationsRepository;

    public List<DailyReservations> findAllDailyReservations(@PathVariable int courtNumber, @PathVariable Date reservationDate)
    {
        return dailyReservationsRepository.findAllByCourtNumberAndReservationDate(courtNumber, reservationDate);
    }

    public Iterable<DailyReservations> findAllDailyReservations() {
        return dailyReservationsRepository.findAll();
    }
}
