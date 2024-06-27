package com.lab308.lab308ComplexRelationships.EventManagement.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Conference extends Event{

    @OneToMany
    private List<Speaker> speakers;

}
