package com.example.dao;

import com.example.po.Customer;

public interface CustomerDao {
    public Customer findCustomerById(Integer id);
}
