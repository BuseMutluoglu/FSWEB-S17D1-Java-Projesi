package com.workintech.rest.validation;

import com.workintech.rest.entity.Animal;

import java.util.Map;

public class AnimalValidation {
    public static boolean isIdValid(int id){
        return !(id<0);
    }

    public static boolean isMapContainsKey(Map<Integer, Animal> animal, int id){
        return animal.containsKey(id);
    }

    public static boolean isAnimalCredentialsValid(Animal animal){
        return !(animal.getId()<=0||animal.getName()==null||animal.getName().isEmpty());
    }
}
