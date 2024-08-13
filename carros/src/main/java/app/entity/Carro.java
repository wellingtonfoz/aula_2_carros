package app.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity 	//OBRIGATÓRIO - para criar/vincular a classe Java à uma tabela do banco
@Getter		//para gerar os getters da entidade em tempo de execução
@Setter		//para gerar os setters da entidade em tempo de execução
@NoArgsConstructor	//para disponibilizar um construtor sem parâmetros
@AllArgsConstructor	//para disponibilizar um construtor com todos os parâmetros
public class Carro {
	
	@Id //OBRIGATÓRIO - para indicar que é a chave primária da respectiva tabela no BD
	@GeneratedValue(strategy = GenerationType.IDENTITY) //OBRIGATÓRIO - para indicar que o ID autoincrementa
	private long id;
	
	private String nome;
	private String modelo;
	private String placa;
	private int ano;
	
	//Coloquem o JSONIGNOREPROPERTIES somente se no outro lado da relação tiver o mapeamento inverso (mappedby)
	//e o JSONIGNOREPROPERTIES deve sempre ter o nome do objeto que está do outro lado da relação
	@ManyToOne
	@JsonIgnoreProperties("carros")
	private Marca marca;
	
	@ManyToMany
	@JoinTable(name="carro_tem_proprietario") //aqui estamos definindo o nome da TABELA DA RELAÇÃO N PRA N
	@JsonIgnoreProperties("carros")
	private List<Proprietario> produtos;
	
}
