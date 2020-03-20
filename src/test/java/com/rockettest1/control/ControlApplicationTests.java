package com.rockettest1.control;

import com.rockettest1.control.models.Measures;
import com.rockettest1.control.repositories.MeasuresRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("test")
public class ControlApplicationTests{


    @Test
    public void contextLoad(){



    }
}

    // TODO
    //1. Design domain model and split into functional areas
    // if possible draw it on paper first
    // - humidity, pressure, etc. what fields and type of fields should we store for each entity
    // -
    // - user, ?role?, ?group?
    // 2. Create CRUD test for each entity.
    // 3. Commit to github


