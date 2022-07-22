package com.chesh.delivery.parceldataprovider.service;

import com.chesh.delivery.parcel.data.dao.DeliveryOrderRepository;
import com.chesh.delivery.parcel.data.model.DeliveryOrder;
import com.chesh.delivery.parceldataprovider.cache.CacheNames;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(collectionResourceRel = "orders", path = "orders")
public interface DeliveryOrderRestRepository extends DeliveryOrderRepository, PagingAndSortingRepository<DeliveryOrder, Long> {

//    @Cacheable(CacheNames.COMMON)
    @Override
    default DeliveryOrder findAllByDeliveryOrderId(Long deliveryOrderId) {
        return findById(deliveryOrderId).orElse(null);
    }

//    @CachePut(cacheNames = "adminCache", key = "#a0.deliveryOrderId")
//    @Override
//    <S extends DeliveryOrder> S save(S entity);

//    @CacheEvict(cacheNames = "adminCache", key = "#a0.deliveryOrderId")
//    @Override
//    void delete(DeliveryOrder entity);
}
