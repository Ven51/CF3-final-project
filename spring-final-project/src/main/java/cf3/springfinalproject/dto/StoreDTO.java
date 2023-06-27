package cf3.springfinalproject.dto;

public class StoreDTO {

    private Long storeId;
    private String storeName;
    private int rate;
    private Long cityId;

    // public StoreDTO() {}

    public StoreDTO(Long storeId, String storeName, int rate, Long cityId) {
        this.storeName = storeName;
        this.rate = rate;
        this.storeId = storeId;
        this.cityId = cityId;
    }

    public StoreDTO(Long id, String storeName, Integer rate) {
    }

    public Long getStoreId() {
        return storeId;
    }
    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public int getRate() {
        return rate;
    }
    public void setRate(int rate) {
        this.rate = rate;
    }

    public Long getCityId() {
        return cityId;
    }
    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

}
