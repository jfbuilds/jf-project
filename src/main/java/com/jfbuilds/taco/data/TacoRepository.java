package com.jfbuilds.taco.data;

import org.springframework.data.repository.CrudRepository;

import com.jfbuilds.taco.Taco;

public interface TacoRepository extends CrudRepository<Taco, Long> {

}
