package com.Nobroker.service;

import com.Nobroker.payload.OwnerPlanDto;

import java.util.List;

public interface OwnerPlanService {
    public OwnerPlanDto createOwnerPlans(OwnerPlanDto ownerPlanDto);


    List<OwnerPlanDto> getAllOwnerPalns();
}
