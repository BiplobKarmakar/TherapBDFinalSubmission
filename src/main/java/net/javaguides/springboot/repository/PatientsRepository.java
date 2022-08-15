package net.javaguides.springboot.repository;

import org.springframework.stereotype.Repository;
import net.javaguides.springboot.model.Patients;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;

//import com.Threapbd.Main.Entity.Role;


@Repository
public interface PatientsRepository extends JpaRepository<Patients,Long >  {

}
