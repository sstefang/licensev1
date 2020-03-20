package com.rockettest1.control.repositories;

import com.rockettest1.control.models.Data;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataDAO extends JpaRepository<Data, Long> {
}
