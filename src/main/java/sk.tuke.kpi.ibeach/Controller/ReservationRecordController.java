package sk.tuke.kpi.ibeach.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import sk.tuke.kpi.ibeach.Entity.Customer;
import sk.tuke.kpi.ibeach.Entity.DailyReservations;
import sk.tuke.kpi.ibeach.Entity.ReservationRecord;
import sk.tuke.kpi.ibeach.Service.DailyReservationsService;
import sk.tuke.kpi.ibeach.Service.ReservationRecordService;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reservations")
public class ReservationRecordController {
    @Autowired
    private ReservationRecordService reservationRecordService;

    @Autowired
    private DailyReservationsService dailyReservationsService;

    @PostMapping("/create")
    public ModelAndView createReservation(@RequestParam("court_number") int courtNumber, @RequestParam("customer") Customer customer,
                                          @RequestParam("start_time") Date startTime, @RequestParam("end_time") Date endTime) {
        reservationRecordService.createReservation(courtNumber, customer, startTime, endTime);
        return new ModelAndView("/reservationsBrowse").addObject("reservations", dailyReservationsService.findAllDailyReservations(courtNumber, startTime)); // TODO: TU CO??
    }

    @PostMapping("/delete/{id}")
    public ModelAndView deleteReservation(@PathVariable Long id) {
        ReservationRecord deletedReservation = reservationRecordService.findReservationById(id);
        reservationRecordService.deleteReservation(id);
        return new ModelAndView("/reservationsBrowse").addObject("reservations", dailyReservationsService.findAllDailyReservations(deletedReservation.getCourtNumber(), deletedReservation.getStartTime()));
    }
    // ???

    @PostMapping("/update/{id}")
    public ModelAndView updateReservation(@RequestParam("id") Long id, @RequestParam("court_number") int courtNumber, @RequestParam("customer") Customer customer,
                                          @RequestParam("start_time") Date startTime, @RequestParam("end_time") Date endTime) {

        reservationRecordService.updateReservationRecord(id, courtNumber, customer, startTime, endTime);
        return new ModelAndView("/reservationsBrowse").addObject("reservations", dailyReservationsService.findAllDailyReservations(courtNumber, startTime));
    }

    @GetMapping("/get")
    public Iterable<ReservationRecord> getReservations() {
        return reservationRecordService.findReservations();
    }
}
