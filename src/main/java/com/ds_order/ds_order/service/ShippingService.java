package com.ds_order.ds_order.service;

import com.ds_order.ds_order.entity.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    /*private Order order;
    public ShippingService(Order order) {
        this.order = order;
    }*/

    public Double shipment(Order order){
        if(order.getBasic()<100.00)
            return 20.00;

        if(order.getBasic()>=100.00 && order.getBasic()<200.00)
            return 12.00;

        return 0.0;
    }
}
