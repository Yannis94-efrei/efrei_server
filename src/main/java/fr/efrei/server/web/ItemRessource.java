package fr.efrei.server.web;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")


public class ItemRessource {
    @GetMapping("/items")
    public String test(){
        return "Hello World !";
    }
}
