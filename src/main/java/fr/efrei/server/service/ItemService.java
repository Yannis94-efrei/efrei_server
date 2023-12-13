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
<<<<<<< HEAD

=======
    @Autowired
>>>>>>> ae1689d9fcb8cc53805987097cb372cb1df67288
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<Item> findAll() {
<<<<<<< HEAD
        return itemRepository.findAll();
=======
        return new ArrayList<>();
>>>>>>> ae1689d9fcb8cc53805987097cb372cb1df67288
    }
}
