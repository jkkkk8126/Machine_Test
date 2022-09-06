package com.prabhat.Demo_RESTAPI;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.prabhat.RESTAPI.model.Item;
import com.prabhat.RESTAPI.model.Orders;
import com.prabhat.RESTAPI.repo.ItemRepo;
import com.prabhat.RESTAPI.repo.OrderRepo;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootTest
class DemoRestapiApplicationTests {

	@Autowired
	ItemRepo itemRepo;

	@Autowired
	OrderRepo orderRepo;

	@Test
	public void itemAdded() {
		Item i = new Item("Shoes", 1, 2);
		itemRepo.save(i);
		assertNotNull(itemRepo.findById((long) i.getItemId()).get());
	}

	@Test
	public void orderAdded() {
		Orders o = new Orders("28/08/2022", "In progress");
		orderRepo.save(o);
		assertNotNull(orderRepo.findById((long) o.getOrderId()).get());
	}
}


