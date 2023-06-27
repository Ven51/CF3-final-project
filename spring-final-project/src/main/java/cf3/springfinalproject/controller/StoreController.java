package cf3.springfinalproject.controller;

import cf3.springfinalproject.dto.StoreDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/stores")
public class StoreController {

    @GetMapping("/insert")
    public String getInsertForm(Model model) {
        model.addAttribute("storeForm", new StoreDTO());
        return "insert";
    }

}
