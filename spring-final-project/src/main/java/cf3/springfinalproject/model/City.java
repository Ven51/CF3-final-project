package cf3.springfinalproject.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class City {
    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Long id;

    @Column(name = "CITY_NAME")
    private String cityName;

    @OneToMany(mappedBy = "city")
    List<Store> stores = new ArrayList<>();

    protected City() {}

    public City(String cityName) {
        this.cityName = cityName;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public List<Store> getStores() {
        return stores;
    }
    public void setStores(List<Store> stores) {
        this.stores = stores;
    }

}
