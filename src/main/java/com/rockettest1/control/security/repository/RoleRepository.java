package com.rockettest1.control.security.repository;


import com.rockettest1.control.security.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import security.model.Role;
@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{
}