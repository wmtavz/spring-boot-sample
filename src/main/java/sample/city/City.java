package sample.city;

import org.seasar.doma.Entity;
import org.seasar.doma.Id;

@Entity
public class City {

  @Id
  public Integer id;

  public String name;

  public IsoAlpha3Code country_code;

  @Override
  public String toString() {
    return "City [id=" + id + ", name=" + name + ", country_code=" + country_code + "]";
  }

}
