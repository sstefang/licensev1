package com.rockettest1.control.services;

import com.rockettest1.control.models.Measures;
import com.rockettest1.control.repositories.MeasuresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public class MeasuresServiceImpl implements MeasuresService {
    @Override
    public Measures save(Measures measures) {
        return null;
    }

    @Override
    public Page<Measures> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Optional<Measures> findOne(Long id) {
        return Optional.empty();
    }

    @Override
    public void delete(Long id) {

    }


    @Autowired
    private MeasuresRepository measuresRepository;

    @Transactional
    public void addClient(Measures measures) {
        measuresRepository.saveAndFlush(measures);
    }


}

