package com.example.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.entities.Player;

@RepositoryRestResource
public interface PlayersRepository extends CrudRepository<Player, Integer>  {
}
