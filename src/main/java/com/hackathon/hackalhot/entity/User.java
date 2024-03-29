package com.hackathon.hackalhot.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="user_warehouse")
public class User {

  @Id
  @Column(name="user_id")
  @GeneratedValue(generator="uuid2")
  @GenericGenerator(name="uuid2", strategy= "org.hibernate.id.UUIDGenerator")
  private String id;

  @Column(name="user_name")
  private String name;

  @Column
  private String address;

  @Column
  private String contactNumber;
}
