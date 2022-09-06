package com.prabhat.RESTAPI.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prabhat.RESTAPI.exception.InvalidOrderByException;
import com.prabhat.RESTAPI.model.Orders;
import com.prabhat.RESTAPI.repo.OrderRepo;

@Service
public class OrderService {

	@Autowired
	OrderRepo orderRepo;

	public List<Orders> findAllOrders() {
		return orderRepo.findAll();
	}

	public Orders saveOrder(Orders order) {
		return orderRepo.save(order);
	}

	public Orders findOrdersById(long id) throws InvalidOrderByException {
		Optional<Orders> orders = orderRepo.findById(id);
		if (orders.isPresent()) {
			return orders.get();
		} else {
			throw new InvalidOrderByException("There is no order existing with id : " + id);
		}

	}
}
