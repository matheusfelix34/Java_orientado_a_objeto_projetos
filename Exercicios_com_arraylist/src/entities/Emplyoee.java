package entities;

public class Emplyoee {
	private String id,nome;
	private Double salary;
	

	public Emplyoee( String id, String nome,Double salary) {
		this.id=id;
		this.nome=nome;
		this.salary=salary;
	}

	public Emplyoee( ) {
		
	}
	
	public String toString() {
		
		return getId()+", "+getNome()+", "+String.format("%.2f", getSalary()) ;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalary() {
		return salary;
	}

	public void increaseSalary(Double percentage) {
		
		
		this.salary+=(salary*percentage)/100;
	}
	
	
		
}
