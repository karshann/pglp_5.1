package org.example;

import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class CompositePersonnelDAOTest {

    @Test
    public void create() {
        CompositePersonnel compositePersonnel= new CompositePersonnel();
        Personnel P=new Personnel.Builder("Jean","Paul").telephone("02589445272").naissance(LocalDateTime.of(1997,11,18,21,05)).fonction("PDG").build();
        compositePersonnel.add(P);
        CompositePersonnelDAO CPersD= new CompositePersonnelDAO();
        CPersD.create(compositePersonnel);
    }

    @Test
    public void find() {
        CompositePersonnel compositePersonnel= new CompositePersonnel();
        CompositePersonnel compositePersonnel1= new CompositePersonnel();
        Personnel P=new Personnel.Builder("Jean","Paul").telephone("02589445272").naissance(LocalDateTime.of(1997,11,18,21,05)).fonction("PDG").build();
        compositePersonnel.add(P);
        CompositePersonnelDAO CPersD= new CompositePersonnelDAO();
        compositePersonnel1=CPersD.find("CompositePersonnel");
        compositePersonnel.equals(compositePersonnel1);
    }

    @Test
    public void delete() {
        CompositePersonnelDAO CPersD= new CompositePersonnelDAO();
        CPersD.delete("CompositePersonnel");
    }
}