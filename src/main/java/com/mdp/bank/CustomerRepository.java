package com.mdp.bank;

import com.mdp.bank.model.Customer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created on 2/25/16.
 *
 * @author Adrian Pena
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
