package app.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity 	//OBRIGATÓRIO - para criar/vincular a classe Java à uma tabela do banco
@Getter		//para gerar os getters da entidade em tempo de execução
@Setter		//para gerar os setters da entidade em tempo de execução
@NoArgsConstructor	//para disponibilizar um construtor sem parâmetros
@AllArgsConstructor	//para disponibilizar um construtor com todos os parâmetros
public class Proprietario {

	@Id //OBRIGATÓRIO - para indicar que é a chave primária da respectiva tabela no BD
	@GeneratedValue(strategy = GenerationType.IDENTITY) //OBRIGATÓRIO - para indicar que o ID autoincrementa
	private long id;

	private String nome;
	
	private double preco;

	//Coloquem o JSONIGNOREPROPERTIES somente se no outro lado da relação tiver o mapeamento inverso (mappedby)
	//e o JSONIGNOREPROPERTIES deve sempre ter o nome do objeto que está do outro lado da relação
	@ManyToMany(mappedBy="proprietarios")
	@JsonIgnoreProperties("proprietarios")
	private List<Carro> carros;

}
