package com.sl.ms.ordermanagement.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sl.ms.ordermanagement.model.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item,Integer>  {

}
