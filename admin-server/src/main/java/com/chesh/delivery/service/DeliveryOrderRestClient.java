package com.chesh.delivery.service;

import com.chesh.delivery.parcel.data.dao.DeliveryOrderRepository;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "parcelDataProviderClient")
public interface DeliveryOrderRestClient extends DeliveryOrderRepository {
}
