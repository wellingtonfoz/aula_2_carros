package entity;

public class Carro {
	
	private long id;
	private String nome;
	private String marca;
	private String modelo;
	
	
	public Carro() {
		
	}
	
	public Carro(long id, String nome, String marca, String modelo) {
		this.id = id;
		this.nome = nome;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
}
