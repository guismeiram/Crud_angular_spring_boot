package br.com.crud_angular_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.crud_angular_spring.models.Medico;


@Repository
public interface MedicoRepository extends JpaRepository<Medico,Long>{

}
