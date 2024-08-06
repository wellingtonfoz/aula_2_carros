package app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.entity.Carro;
import app.repository.CarroRepository;

@Service
public class CarroService {
	
	@Autowired
	private CarroRepository carroRepository;
	

	public String save (Carro carro) {
		this.carroRepository.save(carro);
		return "Carro cadastrado com sucesso";
	}
	
	public String update (Carro carro, long id) {
		carro.setId(id);
		this.carroRepository.save(carro);
		return "Atualizado com sucesso";
	}
	
	public Carro findById (long id) {
		
		Optional<Carro> optional = this.carroRepository.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}else
			return null;
		
	}
	
	public List<Carro> findAll () {
		
		return this.carroRepository.findAll();
		
	}
	
	public String delete (long id) {
		this.carroRepository.deleteById(id);
		return "Veículo deletado com sucesso!";
	}
	
}
