package com.prabhat.RESTAPI.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prabhat.RESTAPI.model.Item;

@Repository
public interface ItemRepo extends JpaRepository<Item, Long> {

}
