package com.Nobroker.payload;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OwnerPlanDto {

    private long planId;
    private String planName;
    private double price;
    private int palnValidity;
    private boolean RelationshipManager;
    private boolean RentalAgreement;
    private boolean PropertyPromotion;
    private boolean GuaranteedTenants;
    private boolean ShowingProperty;
    private boolean FacebookMarketingOfProperty;
}
