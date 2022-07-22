package com.chesh.delivery.service;

import com.chesh.delivery.dao.rest.DeliveryOrderRestClient;
import com.chesh.delivery.parcel.data.model.DeliveryOrder;
import org.springframework.stereotype.Service;

@Service
public class DeliveryOrderService {
    private final DeliveryOrderRestClient parcelDataProviderClient;

    public DeliveryOrderService(DeliveryOrderRestClient parcelDataProviderClient) {
        this.parcelDataProviderClient = parcelDataProviderClient;
    }

    public DeliveryOrder findById(Long id) {
        return parcelDataProviderClient.findAllByDeliveryOrderId(id);
    }
}
