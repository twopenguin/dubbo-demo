package com.zcd.dubbo;

import com.zcd.dubbo.exception.HelloException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) throws IOException {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("order-consumer.xml");

        //用户下单过程
        IOrderServices services=(IOrderServices)context.getBean("orderServices");

//        DoOrderRequest request=new DoOrderRequest();
//        request.setName("mic");
//        DoOrderResponse response=services.doOrder(request);

//        System.out.println(response);
        try {
            services.dubboException("world");
        }catch (HelloException exception){
            System.out.println("HelloException :");
        }
        //Order.doOrder();
        System.in.read();
    }
}
