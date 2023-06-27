package cf3.springfinalproject.service;

import cf3.springfinalproject.dto.StoreDTO;
import cf3.springfinalproject.model.City;
import cf3.springfinalproject.model.Store;

import java.util.List;
import java.util.Optional;

public interface IStoreService {
    Store insertStore(StoreDTO storeDTO);
    Store updateStore(StoreDTO storeDTO);
    void deleteStore(Long id);
    Optional<Store> findStoreById(Long id);
    List<Store> getByStoreName(String storeName);
    List<Store> getStoreByCity(City city);

}
