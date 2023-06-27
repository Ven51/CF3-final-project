package cf3.springfinalproject.rest;

import cf3.springfinalproject.dto.StoreDTO;
import cf3.springfinalproject.model.Store;
import cf3.springfinalproject.service.IStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StoreRestController {

    private final IStoreService storeService;

    @Autowired
    public StoreRestController(IStoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping(path = "/stores/{id}")
    public ResponseEntity<StoreDTO> findStoreById(@PathVariable("id") Long id) {
        Store store = storeService.findStoreById(id).orElse(new Store("Not Found", -1, null));
        StoreDTO storeDTO = new StoreDTO(store.getId(), store.getStoreName(), store.getRate());
        return new ResponseEntity<> (storeDTO, HttpStatus.OK);
    }

}
