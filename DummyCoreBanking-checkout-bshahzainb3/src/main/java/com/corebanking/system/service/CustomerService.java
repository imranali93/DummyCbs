package com.corebanking.system.service;


import com.corebanking.system.model.dto.CreateOTPDto;
import com.corebanking.system.model.dto.CustomerDto;
import com.corebanking.system.model.dto.LoginDto;
import com.corebanking.system.model.entity.Customer;

import java.util.List;

public interface CustomerService
{
    String addUser(CustomerDto customer);

    Customer createOTP(CreateOTPDto createOTPDto);

    //Customer register(Customer customer);

    void deleteCustomer(Long id);

    CustomerDto updateCustomer(CustomerDto customer);

    List<Customer> getAllCustomers();
    CustomerDto getCustomerWithEmail(String email);
    CustomerDto getCustomerWithCnic(String cnic );

    CustomerDto getCustomerDetails(String cnic , String email , String accountNumber);
    String login(LoginDto loginDto);
    CustomerDto getCustomerWithId(Long id);
}
