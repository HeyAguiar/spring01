package course.entities;

import java.io.Serializable;

import jakarta.persistence.EmbeddedId;

public class OrderItem implements Serializable{

	private static final long serialVersionUID = 1L;
    
	@EmbeddedId
	private OrderItemPK id;
	private OrderItemPK id = new OrderItemPK();
	private Integer quantity;
	private Double price;
	
	public OrderItem() {
		
	}

	
}
