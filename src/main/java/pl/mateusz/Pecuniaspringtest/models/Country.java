package pl.mateusz.Pecuniaspringtest.models;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "country")
public class Country {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String continent;
  private String countryen;
  private String countrypl;
  private String cod;
  private int count;
}
