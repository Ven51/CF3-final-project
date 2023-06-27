package cf3.springfinalproject.service;

import cf3.springfinalproject.dto.StoreDTO;
import cf3.springfinalproject.model.City;
import cf3.springfinalproject.model.Store;
import cf3.springfinalproject.repository.CityRepository;
import cf3.springfinalproject.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class StoreServiceImpl implements IStoreService {

    private final StoreRepository storeRepository;
    private final CityRepository cityRepository;

    @Autowired
    public StoreServiceImpl(StoreRepository storeRepository,  CityRepository cityRepository) {
        this.storeRepository = storeRepository;
        this.cityRepository  = cityRepository;
    }

    @Transactional
    @Override
    public Store insertStore(StoreDTO storeDTO) {
        return storeRepository.save(convertToModel(storeDTO));
    }

    @Transactional
    @Override
    public Store updateStore(StoreDTO storeDTO) {
        Optional<Store> store = storeRepository.findById(storeDTO.getStoreId());
        return storeRepository.save(convertToModel(storeDTO));
    }

    @Transactional
    @Override
    public void deleteStore(Long id) {
        storeRepository.deleteById(id);
    }

    @Override
    public Optional<Store> findStoreById(Long id) {
        Optional<Store> store = storeRepository.findById(id);
        return store;
    }

    @Override
    public List<Store> getByStoreName(String storeName) {
        List<Store> stores = storeRepository.findByStoreName(storeName);
        return stores;
    }

    @Override
    public List<Store> getStoreByCity(City city) {
        List<Store> stores = storeRepository.getStoreByCity(city);
        return stores;
    }

    private Store convertToModel(StoreDTO storeDTO) {
        Optional<City> city = cityRepository.findById(storeDTO.getCityId());
        return new Store(storeDTO.getStoreName(), storeDTO.getRate(), city.get());
    }
}
