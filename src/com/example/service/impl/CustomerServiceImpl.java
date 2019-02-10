package com.example.service.impl;

import com.example.dao.CustomerDao;
import com.example.po.Customer;
import com.example.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;

    @Override
    public Customer findCustomerById(Integer id) {
        return this.customerDao.findCustomerById(id);
    }
}
