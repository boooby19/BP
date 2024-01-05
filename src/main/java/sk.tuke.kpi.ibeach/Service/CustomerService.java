package sk.tuke.kpi.ibeach.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import sk.tuke.kpi.ibeach.Entity.Customer;
import sk.tuke.kpi.ibeach.Entity.ReservationRecord;
import sk.tuke.kpi.ibeach.Repository.CustomerRepository;

import java.util.Collection;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer createCustomer(String name, String lastname, String contactNumber, String email, List<ReservationRecord> reservations)
    {
        Customer customer = new Customer();
        customer.setName(name);
        customer.setLastName(lastname);
        customer.setContactNumber(contactNumber);
        customer.setEmail(email);
        customer.setReservations(reservations);
        return customerRepository.save(customer);
    }

    public boolean deleteCustomer(Long id)
    {
        try
        {
            customerRepository.deleteById(id);
            return true;
        } catch(IllegalArgumentException e)
        {
            return false;
        }
    }

    public Customer updateCustomer(Long id, String name, String lastname, String contactNumber, String email, List<ReservationRecord> reservations)
    {
        Customer customer = customerRepository.findById(id).orElseThrow(IllegalArgumentException::new);
        customer.setName(name);
        customer.setLastName(lastname);
        customer.setContactNumber(contactNumber);
        customer.setEmail(email);
        customer.setReservations(reservations);
        return customerRepository.save(customer);
    }

    public List<Customer> findAllByEmail(@PathVariable String email) {
        return customerRepository.findAllByEmail(email);
    }

    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    }

    public Customer findCustomerById(@PathVariable Long id){
        return customerRepository.findById(id).orElseThrow(IllegalArgumentException::new);
    }
}
