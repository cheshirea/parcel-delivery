package com.chesh.delivery.parcel.data.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class DeliveryOrder {

    private Long deliveryOrderId;
    private LocalDateTime createdAt;
    private Status status;
    private String clientId;
    private List<Parcel> parcels;
    private List<ParcelRoute> routes;

    public enum Status {
        CREATED,
        WAITING_FOR_PICK_UP,
        ON_THE_WAY,
        DELIVERED,
        CANCELED
    }
}
