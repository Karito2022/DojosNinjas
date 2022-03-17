package com.karitoreyes.project.repositories;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.karitoreyes.project.models.Ninja;

@Repository
public interface NinjaRepository extends CrudRepository<Ninja, Long>{

    List<Ninja> findAll();
}