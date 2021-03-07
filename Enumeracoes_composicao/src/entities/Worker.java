package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {

	private String name;
	private WorkerLevel level;
	private Double baseSalay;
	
	//associacoes
	private Department department;
	private List<HourContract> contracts= new ArrayList<>();

	
	public Worker(){
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public WorkerLevel getLevel() {
		return level;
	}


	public void setLevel(WorkerLevel level) {
		this.level = level;
	}


	public Double getBaseSalay() {
		return baseSalay;
	}


	public void setBaseSalay(Double baseSalay) {
		this.baseSalay = baseSalay;
	}


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	public List<HourContract> getContracts() {
		return contracts;
	}



	public Worker(String name, WorkerLevel level, Double baseSalay, Department department) {
		super();
		this.name = name;
		this.level = level;
		this.baseSalay = baseSalay;
		this.department = department;
	}
	
	
	public void addContract(HourContract contract) {
	
		contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		
		contracts.remove(contract);
	}
	
	public double income(Integer year, Integer month){
		//esse metodo é para nos dizer no final valor ganho pelo worker 
		double sum =baseSalay;
		//vamos usar o Calendar pra manupalar cada data de contrato
		Calendar cal= Calendar.getInstance();
		
		for (HourContract c : contracts) {
			//peguei a data do contrato e defini como a data do meu calendario
			cal.setTime(c.getDate());
			//agora, que já temos a data no nosso calendario
			//podemos usar o get do Calendar pra pegar o ano dele
			int c_year =cal.get(Calendar.YEAR);
			//adicionamos mais 1, pois o mês no Calendar 
			//comeca com 0
			int c_mouth =1+cal.get(Calendar.MONTH);
			
			if (c_year==year & c_mouth==month) {
				sum+=c.totalValue();
			}
			
		}
		
		return sum;
	}
	
}
