package sk.tuke.kpi.ibeach.WebController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import sk.tuke.kpi.ibeach.Entity.ReservationRecord;
import sk.tuke.kpi.ibeach.Service.DailyReservationsService;
import sk.tuke.kpi.ibeach.Service.ReservationRecordService;

@RestController
public class ReservationRecordWebController {
    @Autowired
    private ReservationRecordService reservationRecordService;

    @Autowired
    private DailyReservationsService dailyReservationsService;

    @GetMapping(value = "/reservations/new")
    public ModelAndView getAddReservation() {
        return new ModelAndView("/reservationsAdd");
    }

    @GetMapping(value = "/reservations/delete/{id}")
    public ModelAndView deleteReservation(@PathVariable Long id) {
        ReservationRecord deletedReservation = reservationRecordService.findReservationById(id);
        return new ModelAndView("/reservationsDelete").addObject("reservations", dailyReservationsService.findAllDailyReservations(deletedReservation.getCourtNumber(), deletedReservation.getStartTime()));
    }

    @GetMapping(value = "/reservations/update/{id}")
    public ModelAndView updateReservation(@PathVariable Long id)
    {
        ReservationRecord updatedReservation = reservationRecordService.findReservationById(id);
        return new ModelAndView("/reservationsUpdate").addObject("reservations", dailyReservationsService.findAllDailyReservations(updatedReservation.getCourtNumber(), updatedReservation.getStartTime()));
    }
}
