package sk.tuke.kpi.ibeach.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import sk.tuke.kpi.ibeach.Entity.DailyReservations;
import sk.tuke.kpi.ibeach.Entity.ReservationRecord;
import sk.tuke.kpi.ibeach.Service.DailyReservationsService;
import sk.tuke.kpi.ibeach.Service.ReservationRecordService;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/reservations")
public class DailyReservationsController {

    @Autowired
    private DailyReservationsService dailyReservationsService;

    @GetMapping("/dailyReservations/{courtNumber}/{reservationDate}")
    public ModelAndView getDailyReservations(
            @PathVariable int courtNumber,
            @PathVariable Date reservationDate) {
        dailyReservationsService.findAllDailyReservations(courtNumber, reservationDate);
        return new ModelAndView("/reservationsBrowse").addObject("reservations", dailyReservationsService.findAllDailyReservations(courtNumber, reservationDate));
    }

    @GetMapping("/dailyReservations/get")
    public Iterable<DailyReservations> getAllDailyReservations() {
        return dailyReservationsService.findAllDailyReservations();
    }
}
