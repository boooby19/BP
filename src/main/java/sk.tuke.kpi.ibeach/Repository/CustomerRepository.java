package sk.tuke.kpi.ibeach.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sk.tuke.kpi.ibeach.Entity.Customer;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long>
{
    List<Customer> findAllByEmail (String email);
}
