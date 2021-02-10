package com.sl.ms.ordermanagement.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sl.ms.ordermanagement.model.Item;
import com.sl.ms.ordermanagement.model.Order;
import com.sl.ms.ordermanagement.repository.ItemRepository;
import com.sl.ms.ordermanagement.repository.OrderRepository;

@RestController
public class OrderController {
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private ItemRepository itemRepository;
	
	//fetch list of order and items in that order
	@GetMapping("/orders")
	public Iterable<Order> retrieveAllorders(){
		
		return orderRepository.findAll();
	}
	
	//fetch details of specific order
	@GetMapping("/orders/{id}")	
	public Optional<Order> getSpecificOrder(@PathVariable int id) {
		
		Optional<Order> order = orderRepository.findById(id);
		return order;
	}
	
	//create items for specific order
	@PostMapping("/orders/{id}")
	public void createOrder(@PathVariable int id, @RequestBody Item item) {
		Optional<Order> orderOptional = orderRepository.findById(id);
		Order order = orderOptional.get();
		item.setOrder(order);				
		itemRepository.save(item);
	}
	
	//delete specific order
	@DeleteMapping("/orders/{id}")
	public void deleteOrder(@PathVariable int id) {
		orderRepository.deleteById(id);
	}
	
}
