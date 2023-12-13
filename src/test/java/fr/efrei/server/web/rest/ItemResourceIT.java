package fr.efrei.server.web.rest;

import fr.efrei.server.domain.Item;
import fr.efrei.server.repository.ItemRepository;
import fr.efrei.server.service.ItemService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@TestPropertySource(
        locations = "classpath:application-test.properties")
public class ItemResourceIT {
    @Autowired
    private ItemService itemService;

    @Test
    @Transactional
    void createItem() {
        int databaseSizeBeforeCreate = itemService.findAll().size();
        assertThat(databaseSizeBeforeCreate).isEqualTo(0);

        Item item = new Item();
        item.setName("Yannis");
        item.setPrice(2.1);
        itemService.create(item);

        List<Item> itemList = itemService.findAll();
        assertThat(itemList).hasSize(databaseSizeBeforeCreate + 1);
    }
    @Test
    @Transactional
    void findItemById() {

        Item item = new Item();
        item.setName("Bob");
        item.setPrice(2.4);
        Item createdItem = itemService.create(item);
        Item foundItem = itemService.findWithId(createdItem.getId());

        assertThat(foundItem).isNotNull();
        assertThat(foundItem.getId()).isEqualTo(createdItem.getId());
        assertThat(foundItem.getName()).isEqualTo(createdItem.getName());
        assertThat(foundItem.getPrice()).isEqualTo(createdItem.getPrice());
    }

    @Test
    @Transactional
    void updateItem() {
        Item existingItem = itemService.create(new Item("Yannis", 2.2));

        existingItem.setName("NewYannis");
        itemService.create(existingItem);

        Item updatedItem = itemService.findWithId(existingItem.getId());
        assertThat(updatedItem).isNotNull();
        assertThat(updatedItem.getName()).isEqualTo("NewYannis");
    }


    @Test
    @Transactional
    void deleteItem() {
        Item existingItem = itemService.create(new Item("Yannis", 2.2));
        assertThat(itemService.findWithId(existingItem.getId())).isNotNull();
        int databaseSizeBeforeDelete = itemService.findAll().size();
        itemService.delete(existingItem.getId());

        assertThat(itemService.findWithId(existingItem.getId())).isNull();
        List<Item> itemList = itemService.findAll();
        assertThat(itemList).hasSize(databaseSizeBeforeDelete - 1);
    }
}