package dat3.cars.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode

@Entity
public class Car {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int carId;

  @Column(nullable = false)
  private String brand;

  @Column(nullable = false)
  private String model;

  @Column
  private double pricePerDay;

  @Column
  private double bestDiscount;

  @CreationTimestamp
  private LocalDateTime dateCreated;

  @UpdateTimestamp
  private LocalDateTime dateEdited;

  public Car(String brand, String model, double pricePerDay, double bestDiscount){
    this.brand = brand;
    this.model = model;
    this.pricePerDay = pricePerDay;
    this.bestDiscount = bestDiscount;
  }

}
