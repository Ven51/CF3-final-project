package cf3.springfinalproject.model;

import javax.persistence.*;

@Entity
@Table(name = "STORES")
public class Store {
    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Long id;

    @Column(name = "STORE_NAME")
    private String storeName;

    @Column(name = "RATE")
    private Integer rate;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "CITY_ID")
    private City city;

    protected Store() {}

    public Store(String storeName, Integer rate, City city) {
        this.storeName = storeName;
        this.rate = rate;
        this.city = city;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getStoreName() {
        return storeName;
    }
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public Integer getRate() {
        return rate;
    }
    public void setRate(Integer rate) {
        this.rate = rate;
    }

//    public City getCity() {
//        return city;
//    }
//    public void setCity(City city) {
//        this.city = city;
//    }

}
