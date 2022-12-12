package curso.exercicios.enumeradores;

import curso.entities.OrderStatus;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Order order = new Order(1080, new Date(), OrderStatus.PROCESSING);
        System.out.print(order);

        OrderStatus os = OrderStatus.PENDING_PAYMENT;
        OrderStatus os1 = OrderStatus.SHIPPED;
        OrderStatus os2 = OrderStatus.DEVILERED;
        OrderStatus os3 = OrderStatus.valueOf("PROCESSING");

        System.out.println(os);
        System.out.println(os1);
        System.out.println(os2);
        System.out.println(os3);

    }
}
