package dev.adrianlorenzo.crmservice.services;

import dev.adrianlorenzo.crmservice.model.Customer;
import dev.adrianlorenzo.crmservice.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MockCustomerService implements CustomerService {

    @Autowired
    private CustomerRepository repository;

    @Override
    public List<Customer> findAll() {
        return repository.findAll();
    }

    @Override
    public Customer findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Long create(Customer customer) { return repository.saveAndFlush(customer).getId(); }

    @Override
    public void update(Customer customer) {
        repository.save(customer);
    }

    @Override
    public void delete(Customer customer) {
        repository.delete(customer);
    }
}
