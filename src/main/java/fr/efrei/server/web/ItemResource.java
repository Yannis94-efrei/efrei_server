package fr.efrei.server.web;

import fr.efrei.server.domain.Item;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ItemResource {

    //public final ItemService itemService;

    //public ItemResource(ItemService itemService) { this.itemService = itemService; }
    public List<Item> getAllItem() {
        return new ArrayList<>();
    }

    @GetMapping("/items/{id}")
    public Item getItem(@PathVariable String id) {
        Item item = new Item();
        item.setName("Pierre");
        return item;
    }
}