package com.mindtree.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{

	Role findByRole(String string);

}
