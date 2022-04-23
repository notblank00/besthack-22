package ru.baza134.besthack22.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "contact_email")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ContactEmail {
  @Id
  Integer id;

  private String email;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "station_id")
  private Station station;
}
