package fr.efrei.server.repository;

<<<<<<< HEAD
import fr.efrei.server.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository  extends JpaRepository<Item, Integer> {

=======
import org.springframework.stereotype.Repository;

@Repository
public class ItemRepository {
>>>>>>> ae1689d9fcb8cc53805987097cb372cb1df67288
}
