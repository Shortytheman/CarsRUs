package dat3.cars.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Car {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int carId;

  private String brand;
  private String model;
  private double pricePerDay;
  private double bestDiscount;

  @CreationTimestamp
  private LocalDateTime dateCreated;

  @UpdateTimestamp
  private LocalDateTime dateEdited;


  public Car(String brand, String model, double pricePerDay, double bestDiscount) {
    this.brand = brand;
    this.model = model;
    this.pricePerDay = pricePerDay;
    this.bestDiscount = bestDiscount;
  }

  public Car(){

  }

  public int getCarId() {
    return carId;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public double getPricePerDay() {
    return pricePerDay;
  }

  public void setPricePerDay(double pricePerDay) {
    this.pricePerDay = pricePerDay;
  }

  public double getBestDiscount() {
    return bestDiscount;
  }

  public void setBestDiscount(double bestDiscount) {
    this.bestDiscount = bestDiscount;
  }
}
