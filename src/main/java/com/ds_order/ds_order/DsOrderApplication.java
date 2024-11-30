package com.ds_order.ds_order;

import com.ds_order.ds_order.entity.Order;
import com.ds_order.ds_order.service.OrderService;
import com.ds_order.ds_order.service.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DsOrderApplication implements CommandLineRunner {
	@Autowired
	Order order;

    @Autowired
    private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DsOrderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter("\n");
		order.setCode(scanner.nextInt());
		order.setBasic(scanner.nextDouble());
		order.setDiscount(scanner.nextDouble());

		System.out.println("Pedido código " + order.getCode());
		System.out.println("Valor total: R$ "+String.format("%.2f", orderService.total(order)));

		/*Order order1 = new Order(1034, 150.0, 20.0);
		System.out.println("Pedido código " + order1.getCode());
		System.out.println("Valor total: R$ " + orderService.total(order1));

		Order order2 = new Order(2282, 800.0, 10.0);
		System.out.println("Pedido código " + order2.getCode());
		System.out.println("Valor total: R$ " + orderService.total(order2));

		Order order3 = new Order(1309, 95.90, 0.0);
		System.out.println("Pedido código " + order3.getCode());
		System.out.println("Valor total: R$ " + orderService.total(order3));*/
		System.exit(0);
	}
}
