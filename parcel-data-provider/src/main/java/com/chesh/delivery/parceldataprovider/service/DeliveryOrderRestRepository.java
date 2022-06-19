package com.chesh.delivery.parceldataprovider.service;

import com.chesh.delivery.parcel.data.dao.DeliveryOrderRepository;
import com.chesh.delivery.parcel.data.model.DeliveryOrder;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "orders", path = "orders")
public interface DeliveryOrderRestRepository extends DeliveryOrderRepository, PagingAndSortingRepository<DeliveryOrder, Long> {
}
