package com.jpa.gateway.runner;

import com.jpa.gateway.entity.Order;
import com.jpa.gateway.entity.OrderStatus;
import com.jpa.gateway.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class MyRunner implements ApplicationRunner {

    @Autowired
    OrderService orderService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
/**Order order1=orderService.save(new Order(19001151L,1011L, LocalDate.of(2025,9,16), OrderStatus.PROCESSED));
 System.out.println("order persisted: "  +  order1);
 Order order2=orderService.save(new Order(19001152L,1011L, LocalDate.of(2025,9,15), OrderStatus.DELIVERED));
 System.out.println("order persisted: "  +  order2);**/


//find by id
//Order order=orderService.findById(19001151L);
//System.out.println("order: "  +order);

//find all
//List<Order> orders= orderService.findAll();
//orders.forEach(System.out::println);
//delete
//        orderService.deleteById(19001151L);
//        System.out.println("Deleted successfully");

        List<Order> orders = orderService.findByCustomerId(1011L);
        orders.forEach(System.out::println);
        //findOrderIdAndStatus

        List<Object[]> list = orderService.findOrderIdAndStatus();
        list.forEach(obj -> System.out.println(Arrays.toString(obj)));


        List<Order> ordstus = orderService.fetchOrderByStatus(String.valueOf((OrderStatus.DELIVERED)));
        ordstus.forEach(System.out::println);

    }

}
