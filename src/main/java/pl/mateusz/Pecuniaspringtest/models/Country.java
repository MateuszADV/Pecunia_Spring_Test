package pl.mateusz.Pecuniaspringtest.models;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Getter
@Setter
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
