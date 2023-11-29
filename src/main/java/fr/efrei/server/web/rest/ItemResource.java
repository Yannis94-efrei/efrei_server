package fr.efrei.server.web.rest;

import fr.efrei.server.domain.Item;
import fr.efrei.server.service.ItemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ItemResource {

    public final ItemService itemService;

    public ItemResource(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/items")
    public List<Item> getAllItem() {
        return itemService.findAll();
    }

    @GetMapping("/items/{id}")
    public Item getItem(@PathVariable String id) {
        Item item = new Item();
        item.setName("Pierre");
        return item;
    }
}