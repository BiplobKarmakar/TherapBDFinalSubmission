package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.Role;
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
     @Query("SELECT r From Role r WHERE r.name=?1")
	public Role findByName(String name);
     }
