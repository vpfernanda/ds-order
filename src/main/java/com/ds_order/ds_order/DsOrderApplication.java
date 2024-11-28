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
		System.exit(0);
	}
}
