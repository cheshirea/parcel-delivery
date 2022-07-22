package com.chesh.delivery.parcel.data.dao;

import com.chesh.delivery.parcel.data.model.DeliveryOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Optional;

//@FeignClient(name = "orders")
public interface DeliveryOrderRepository {

    DeliveryOrder findAllByDeliveryOrderId(Long deliveryOrderId);

}
