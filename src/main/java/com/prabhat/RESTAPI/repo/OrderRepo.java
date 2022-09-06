package com.prabhat.RESTAPI.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.prabhat.RESTAPI.model.Orders;

import org.springframework.data.repository.query.Param;

@Repository
public interface OrderRepo extends JpaRepository<Orders, Long> {

  /*    @Query("SELECT O FROM Orders O WHERE o.orderId=:orderId")
Optional<Orders> findById(@Param("orderId") String orderId); */
}
