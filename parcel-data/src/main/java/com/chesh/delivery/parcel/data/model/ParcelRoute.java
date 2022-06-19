package com.chesh.delivery.parcel.data.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ParcelRoute {

    private Long parcelRouteId;
    private DeliveryOrder deliveryOrder;
    private Long prevParcelRouteId;
    private String originLocationId;
    private String destinationLocationId;
    private String courierId;

}
