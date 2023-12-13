package fr.efrei.server.web.rest;

import fr.efrei.server.domain.Item;
import fr.efrei.server.service.ItemService;
import org.springframework.web.bind.annotation.*;

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

    public Item getItem(@PathVariable Integer id){
        return itemService.findWithId(id);
    }

    @PostMapping("/items")
    public Item createItem(@RequestBody Item item){
        return itemService.create(item);
    }

    @PutMapping("/items")
    public Item updateItem(@PathVariable Integer id, @RequestBody Item item){
        return itemService.update(id, item);
    }

    @DeleteMapping("/items/{id}")
    public void deleteItem(@PathVariable Integer id){
        itemService.delete(id);
    }
}