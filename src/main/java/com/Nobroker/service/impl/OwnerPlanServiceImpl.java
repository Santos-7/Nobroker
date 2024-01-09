package com.Nobroker.service.impl;

import com.Nobroker.entity.OwnerPlan;
import com.Nobroker.payload.OwnerPlanDto;
import com.Nobroker.repositery.OwnerPlanRepository;
import com.Nobroker.service.OwnerPlanService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OwnerPlanServiceImpl implements OwnerPlanService {
    private OwnerPlanRepository ownerPlanRepository;
    private ModelMapper modelMapper;

    public OwnerPlanServiceImpl(OwnerPlanRepository ownerPlanRepository,ModelMapper modelMapper) {
        this.ownerPlanRepository = ownerPlanRepository;
        this.modelMapper=modelMapper;
    }

    @Override
    public OwnerPlanDto createOwnerPlans(OwnerPlanDto ownerPlanDto) {
        OwnerPlan ownerPlan = mapToEntity(ownerPlanDto);
        OwnerPlan savedOwnerPlan = ownerPlanRepository.save(ownerPlan);
        OwnerPlanDto dto = mapToDto(savedOwnerPlan);
        return dto;
    }

    @Override
    public List<OwnerPlanDto> getAllOwnerPalns() {
        List<OwnerPlan> ownerPlans = ownerPlanRepository.findAll();
        List<OwnerPlanDto> ownerPlanDtos = ownerPlans.stream().map(plan -> mapToDto(plan)).collect(Collectors.toList());
   return ownerPlanDtos;
    }

    OwnerPlan mapToEntity(OwnerPlanDto ownerPlanDto){
        OwnerPlan ownerPlan = modelMapper.map(ownerPlanDto, OwnerPlan.class);
        return ownerPlan;
    }
    OwnerPlanDto mapToDto(OwnerPlan ownerPlan){
        OwnerPlanDto ownerPlanDto = modelMapper.map(ownerPlan, OwnerPlanDto.class);
        return ownerPlanDto;
    }
}
