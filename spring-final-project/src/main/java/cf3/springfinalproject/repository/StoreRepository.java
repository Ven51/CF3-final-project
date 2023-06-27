package cf3.springfinalproject.repository;

import cf3.springfinalproject.model.City;
import cf3.springfinalproject.model.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long> {

    List<Store> findByStoreName(String storeName);

    @Query("SELECT s FROM Store s WHERE s.city = ?1")
    List<Store> getStoreByCity(City city);

}
