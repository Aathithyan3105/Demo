package com.example.feignclient1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.feignclient1.bean.*;

public interface ExchangeValueRepository extends 
    JpaRepository<ExchangeValue, Long>{
  ExchangeValue findByFromAndTo(String from, String to);
}