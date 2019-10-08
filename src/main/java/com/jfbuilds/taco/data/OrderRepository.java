package com.jfbuilds.taco.data;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jfbuilds.taco.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {
	
	List<Order> findByDeliveryZip(String deliveryZip);

}
