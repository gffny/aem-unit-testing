package com.gffny.test.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by John D. Gaffney | Isobar US
 * 8/7/16
 */
@Model(adaptables=Resource.class)
public class Car {


    // Inject a property whose name does NOT match the Model field name
    @Inject @Named("jcr:content/jcr:title")
    private String title;


    // Inject a property whose name does NOT match the Model field name
    @Inject @Named("jcr:content/car-details/model")
    private String model;


    // Inject a property whose name does NOT match the Model field name
    @Inject @Named("jcr:content/car-details/manufacturer")
    private String manufacturer;


    // Inject a property whose name does NOT match the Model field name
    @Inject @Named("jcr:content/car-details/engineSize")
    private String engineSize;


    // Inject a property whose name does NOT match the Model field name
    @Inject @Named("jcr:content/car-details/numberOfDoors")
    private int numberOfDoors;


    // Inject a property whose name does NOT match the Model field name
    @Inject @Named("jcr:content/car-details/carType")
    private String carType;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(String engineSize) {
        this.engineSize = engineSize;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "title='" + title + '\'' +
                ", model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", engineSize='" + engineSize + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                ", carType='" + carType + '\'' +
                '}';
    }
}
