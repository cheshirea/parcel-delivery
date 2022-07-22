package com.chesh.delivery.rest;

import com.chesh.delivery.parcel.data.model.DeliveryOrder;
import com.chesh.delivery.service.DeliveryOrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrderController {

    private final DeliveryOrderService deliveryOrderService;

    public OrderController(DeliveryOrderService deliveryOrderService) {
        this.deliveryOrderService = deliveryOrderService;
    }

    @GetMapping
    public DeliveryOrder getDeliveryOrder() {
        return deliveryOrderService.findById(0L);
    }

}
