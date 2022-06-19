package com.chesh.delivery.parcel.data.dao;

import com.chesh.delivery.parcel.data.model.DeliveryOrder;

import java.util.List;

//@FeignClient(name = "orders")
public interface DeliveryOrderRepository {

    List<DeliveryOrder> findAllByDeliveryOrderId(Long deliveryOrderId);

}
