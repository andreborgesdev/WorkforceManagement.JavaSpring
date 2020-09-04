package com.andre.workforcemanagement.controllers;

import com.andre.workforcemanagement.models.*;
import com.andre.workforcemanagement.repositories.MaterialRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/materials")
public class MaterialController {

    @Autowired
    private MaterialRepository materialRepository;

    @GetMapping
    public List<Material> getMaterials() {
        return materialRepository.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public Material getMaterial(@PathVariable Long id) {
        return materialRepository.getOne(id);
    }

    @PostMapping
    public Material createMaterial(@RequestBody final Material material) {
        return materialRepository.saveAndFlush(material);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public Material updateMaterial(@PathVariable Long id, @RequestBody Material material) {
        Material existingMaterial = materialRepository.getOne(id);
        BeanUtils.copyProperties(material, existingMaterial, "material_id");
        return materialRepository.saveAndFlush(existingMaterial);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void deleteMaterial(@PathVariable Long id) {
        materialRepository.deleteById(id);
    }
}
