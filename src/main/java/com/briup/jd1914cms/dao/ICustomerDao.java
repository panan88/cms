package com.briup.jd1914cms.dao;

import com.briup.jd1914cms.bean.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerDao extends JpaRepository<Customer,Integer>{
}
