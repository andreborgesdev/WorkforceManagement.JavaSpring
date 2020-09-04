package com.andre.workforcemanagement.managers;

import com.andre.workforcemanagement.models.Material;
import com.andre.workforcemanagement.repositories.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MaterialManager implements IMaterialManager {

    @Autowired
    private MaterialRepository materialRepository;

    public List<Material> getMaterials() {
        return materialRepository.findAll();
    }
}
