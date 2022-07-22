package com.chesh.delivery.dao.rest;

import com.chesh.delivery.parcel.data.dao.DeliveryOrderRepository;
import com.chesh.delivery.parcel.data.model.DeliveryOrder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "parcelDataProviderClient", url = "localhost:8080")
public interface DeliveryOrderRestClient extends DeliveryOrderRepository {
    @Override
    @GetMapping("/orders/{id}")
    DeliveryOrder findAllByDeliveryOrderId(Long deliveryOrderId);
}
