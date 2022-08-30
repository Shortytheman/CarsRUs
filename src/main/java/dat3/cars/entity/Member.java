package dat3.cars.entity;

import dat3.security.entity.UserWithRoles;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;

@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@Builder


@Entity
public class Member extends UserWithRoles {

  @Column
  String firstName;
  @Column
  String lastName;
  @Column
  String street;
  @Column
  String city;
  @Column
  String zip;

  private boolean approved;
  private int ranking;

  //Constructor til testing
  public Member(String user, String password, String email, String firstName) {
    super(user, password, email);
    this.firstName = firstName;
  }

  public Member(String user, String password, String email, String firstName, String lastName, String street, String city, String zip) {
    super(user, password, email);
    this.firstName = firstName;
    this.lastName = lastName;
    this.street = street;
    this.city = city;
    this.zip = zip;
  }

}