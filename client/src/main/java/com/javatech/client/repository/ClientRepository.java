package com.javatech.client.repository;

import com.javatech.client.model.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository  extends CrudRepository<Client, Integer> {
}
