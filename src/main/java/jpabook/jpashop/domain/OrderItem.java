package jpabook.jpashop.domain;

import javax.persistence.*;

@Entity
public class OrderItem {
    @Id @GeneratedValue
    @Column( name = "ORDER_ITEM_ID")
    private Long id;

//    @Column(name = "ORDER_ID")
//    private Long orderId;

    @ManyToOne
    @JoinColumn(name = "ORDER_ID")
    private  Order order;



//    @Column(name = "ITEM_ID")
//    private Long itemId;

    @ManyToOne
    @JoinColumn(name = "ITEM_ID")
    private Item item;



    private int oderPrice;
    private int count;


    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Item getItem() {
        return item;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public void setOderPrice(int oderPrice) {
        this.oderPrice = oderPrice;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Long getId() {
        return id;
    }


    public int getOderPrice() {
        return oderPrice;
    }

    public int getCount() {
        return count;
    }
}
