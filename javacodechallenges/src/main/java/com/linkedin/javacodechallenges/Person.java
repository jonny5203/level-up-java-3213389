package com.linkedin.javacodechallenges;

//Person model class, that includes firstname
//lastname and getter and setter.
//There is also introduction method
public class Person {
  private String firstName;
  private String lastName;

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  @Override
  public String toString() {
    return "Hi my firstname is: " + firstName + "and my lastname is:" + lastName;
  }
}