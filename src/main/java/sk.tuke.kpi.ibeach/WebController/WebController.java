package sk.tuke.kpi.ibeach.WebController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class WebController {
    @GetMapping(value = "/")
    public ModelAndView homePage(){
        return new ModelAndView("/welcome");
    }

    @GetMapping(value = "/about")
    public ModelAndView aboutPage(){
        return new ModelAndView("/about");
    }

    @GetMapping(value = "/news")
    public ModelAndView newsPage(){
        return new ModelAndView("/news");
    }

    @GetMapping(value = "/prices")
    public ModelAndView pricesPage(){
        return new ModelAndView("/prices");
    }

    @GetMapping(value = "/reservations")
    public ModelAndView reservationsPage(){
        return new ModelAndView("/reservations");
    }

    @GetMapping(value = "/login")
    public ModelAndView loginPage(){
        return new ModelAndView("/login");
    }

    @GetMapping(value = "/contact")
    public ModelAndView contactPage(){
        return new ModelAndView("/contact");
    }
}
