package app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import app.entity.Carro;

public interface CarroRepository extends JpaRepository<Carro, Long> {

	public List<Carro> findByNomeStartsWith(String nome);
	
	@Query("FROM Carro WHERE ano > :ano")
	public List<Carro> findByAcimaAno(int ano);
	
	
}
