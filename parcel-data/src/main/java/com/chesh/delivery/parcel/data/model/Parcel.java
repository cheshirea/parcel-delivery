package com.chesh.delivery.parcel.data.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Parcel {

    private Long parcelId;
    private DeliveryOrder deliveryOrder;
    private Type type;
    private Integer length;
    private Integer width;
    private Integer height;
    private Integer weight;
    private String photoUrl;

    public enum Type {
        DOCUMENT,
        BOX,
        CARGO
    }

}