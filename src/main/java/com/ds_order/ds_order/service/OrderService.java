package com.ds_order.ds_order.service;

import com.ds_order.ds_order.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private ShippingService shippingService;

    public Double total(Order order) {
        Double shipment = shippingService.shipment(order);
        return order.getBasic() - (order.getBasic() * order.getDiscount()) + shipment;
    }
}
