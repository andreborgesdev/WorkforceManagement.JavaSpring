package com.andre.workforcemanagement.models;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity(name = "material")
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long material_id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String reference;

    public Material() {

    }

    public Long getMaterial_id() {
        return material_id;
    }

    public void setMaterial_id(Long material_id) {
        this.material_id = material_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
}
