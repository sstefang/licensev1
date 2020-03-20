package com.rockettest1.control.repositories;

import com.rockettest1.control.controllers.MeasuresController;
import com.rockettest1.control.models.Measures;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface MeasuresRepository extends JpaRepository<Measures, Long> {



}