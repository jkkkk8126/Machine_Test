package com.prabhat.RESTAPI.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prabhat.RESTAPI.exception.InvalidItemByException;
import com.prabhat.RESTAPI.model.Item;
import com.prabhat.RESTAPI.repo.ItemRepo;

@Service
public class ItemService {

	@Autowired
	ItemRepo itemRepo;

	public Item saveItem(Item i) {
		return itemRepo.save(i);
	}

	public List<Item> findAllItems() {
		return itemRepo.findAll();
	}

	public Item findItemsById(long id) throws InvalidItemByException {
		Optional<Item> items = itemRepo.findById(id);
		if (items.isPresent()) {
			return items.get();
		} else {
			throw new InvalidItemByException("There is no item existing with id : " + id);
		}

	}
}
