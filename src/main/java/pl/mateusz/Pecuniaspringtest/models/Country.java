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

//  @GeneratedValue(strategy = GenerationType.AUTO)
  @SequenceGenerator(
          name = "country_sequence",
          sequenceName = "country_sequence",
          allocationSize = 1)
  @Id
  @GeneratedValue(
          strategy = GenerationType.SEQUENCE,
          generator = "country_sequence"
  )
  private Long id;
  private String continent;
  private String countryen;
  private String countrypl;
  private String cod;
  private int count;
}
