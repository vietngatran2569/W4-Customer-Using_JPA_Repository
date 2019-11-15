package com.codegym.repository;

import com.codegym.model.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.web.PageableArgumentResolver;

public interface CustomerRepository extends PagingAndSortingRepository<Customer,Long> {
}
