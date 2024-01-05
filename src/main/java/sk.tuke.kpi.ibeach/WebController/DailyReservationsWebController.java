package sk.tuke.kpi.ibeach.WebController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import sk.tuke.kpi.ibeach.Service.DailyReservationsService;

import java.util.Date;

@RestController
public class DailyReservationsWebController {

    @Autowired
    private DailyReservationsService dailyReservationsService;

    @GetMapping(value = "/reservations/browse")
    public ModelAndView getAllReservations(@RequestParam int court_number, @RequestParam Date date) {
        return new ModelAndView("/reservationsBrowse").addObject("reservations", dailyReservationsService.findAllDailyReservations(court_number, date));
    }
}
