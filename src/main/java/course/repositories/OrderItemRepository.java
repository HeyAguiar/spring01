package course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import course.entities.OrderItem;
import course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	

}
