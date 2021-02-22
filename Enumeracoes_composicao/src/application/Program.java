package application;

import java.util.Date;


import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//primeiro criamos um pedido que está aguardando pagamento 
		Order order= new Order(1080, new Date(), OrderStatus.PEDDING_PAYMENT);
		//usamos o nosso toString
		System.out.println(order);
		//testamos se o enum OrderStatus está suave
		OrderStatus os1 = OrderStatus.DELIVERED;
		//E se quisermos que um enum  receba uma String
		//tipo uma resposta do usuario por exemplo, ai nesse caso,
		//usamos o valueOf("");
		OrderStatus os2= OrderStatus.valueOf("DELIVERED");
		System.out.println(os1);
		System.out.println(os2);
		
	}

}
