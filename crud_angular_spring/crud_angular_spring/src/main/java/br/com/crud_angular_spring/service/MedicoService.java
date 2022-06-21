package br.com.crud_angular_spring.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.crud_angular_spring.models.Medico;
import br.com.crud_angular_spring.repository.MedicoRepository;


@Service
public class MedicoService {
	
	private final MedicoRepository medicoRepository;

	@Autowired
	public MedicoService(MedicoRepository medicoRepository) {
		this.medicoRepository = medicoRepository;
	}

	public Medico createMedico(Medico medico) {
        return medicoRepository.save(medico);
    }
	
	public List<Medico> findAll() {
        return medicoRepository.findAll();

	}
}
