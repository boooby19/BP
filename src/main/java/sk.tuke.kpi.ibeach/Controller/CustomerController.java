package sk.tuke.kpi.ibeach.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import sk.tuke.kpi.ibeach.Entity.Customer;
import sk.tuke.kpi.ibeach.Entity.ReservationRecord;
import sk.tuke.kpi.ibeach.Service.CustomerService;
import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/create")
    public ModelAndView createCustomer(@RequestParam("name") String name, @RequestParam("last_name") String lastName,
                                       @RequestParam("contact_number") String contactNumber, @RequestParam("email") String email, @RequestParam("reservations") List<ReservationRecord> reservations) {
        customerService.createCustomer(name, lastName, contactNumber, email, reservations);
        return new ModelAndView("/customers").addObject("customers", customerService.findAllByEmail(email)); // TODO: TU CO??
    }

    @PostMapping("/delete/{id}")
    public ModelAndView deleteCustomer(@PathVariable Long id) {
        Customer deletedCustomer = customerService.findCustomerById(id);
        customerService.deleteCustomer(id);
        return new ModelAndView("/customers").addObject("customers", customerService.findAllByEmail(deletedCustomer.getEmail()));
    }

    @PostMapping("/update/{id}")
    public ModelAndView updateCustomer(@RequestParam("id") Long id, @RequestParam("name") String name, @RequestParam("last_name") String lastName,
                                       @RequestParam("contact_number") String contactNumber, @RequestParam("email") String email, @RequestParam("reservations") List<ReservationRecord> reservations) {
        customerService.updateCustomer(id, name, lastName, contactNumber, email, reservations);
        return new ModelAndView("/customers").addObject("customers", customerService.findAllByEmail(email));
    }

    @GetMapping("get")
    public Iterable<Customer> getCustomers() {
        return customerService.findAll();
    }
}
