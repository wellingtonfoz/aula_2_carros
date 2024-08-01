package app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import entity.Carro;

@Service
public class CarroService {

	public String save (Carro carro) {
		return "Carro cadastrado com sucesso";
	}
	
	public String update (Carro carro, long id) {
		return "Atualizado com sucesso";
	}
	
	public Carro findById (long id) {
		
		List<Carro> listaTemp = this.findAll();
		
		for (int i = 0; i < listaTemp.size(); i++) {
			if(listaTemp.get(i).getId() == id) {
				return listaTemp.get(i);
			}
		}
		
		return null;
		
	}
	
	public List<Carro> findAll () {
		
		List<Carro> lista = new ArrayList<>();
		lista.add(new Carro(1,"Gol", "VW", "Abc"));
		lista.add(new Carro(2,"Gol 2", "VW", "Abc"));
		lista.add(new Carro(3,"Gol 3", "VW", "Abc"));
		lista.add(new Carro(4,"Gol 4", "VW", "Abc"));
		
		return lista;
	}
	
	public String delete (long id) {
		
		List<Carro> listaTemp = this.findAll();
		
		for (int i = 0; i < listaTemp.size(); i++) {
			if(listaTemp.get(i).getId() == id) {
				return listaTemp.get(i).getNome()+" deletado com sucesso";
			}
		}
		return "Veículo não encontrado";
	}
	
}
