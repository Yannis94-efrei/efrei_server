package fr.efrei.server.service;

import fr.efrei.server.domain.Item;
import fr.efrei.server.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    public final ItemRepository itemRepository;
    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<Item> findAll() {
        return itemRepository.findAll();
    }

    public Item create(Item item) {
        Item NewItem = new Item();
        NewItem.setName(item.getName());
        NewItem.setPrice(item.getPrice());
        return itemRepository.save(NewItem);
    }

    public Item update(Integer id, Item updatedItem) {
        Item item = itemRepository.findById(id).orElse(null);

        if (item != null) {
            item.setName(updatedItem.getName());
            item.setPrice(updatedItem.getPrice());
            return itemRepository.save(item);
        }
        else {
            return null;
        }
    }
    public void delete(Integer id) {
        Item item = itemRepository.findById(id).orElse(null);
        if (item != null) {
            itemRepository.delete(item);
        }
    }
}
