package com.Nobroker.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Owner_plans")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OwnerPlan {
    @Id
    private long planId;
    @Column(name = "planName",unique = true)
    private String planName;
    @Column(name = "price")
    private double price;
    @Column(name = "paln_Validity")
    private int palnValidity;
    @Column(name = "Relationship_Manager")
    private boolean RelationshipManager;
    @Column(name = "Rental_Agreement")
    private boolean RentalAgreement;
    @Column(name = "Property_Promotion")
    private boolean PropertyPromotion;
    @Column(name = "Guaranteed_Tenants")
    private boolean GuaranteedTenants;
    @Column(name = "Showing_Property")
    private boolean ShowingProperty;
    @Column(name = "Facebook_Marketing_Of_Property")
    private boolean FacebookMarketingOfProperty;


}
