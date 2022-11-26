package my.id.adityaariizkyy;

import my.id.adityaariizkyy.service.impl.BookServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext appCtx = new ClassPathXmlApplicationContext("application-context.xml");
        BookServiceImpl bookService = appCtx.getBean("bookService", BookServiceImpl.class);
        System.out.println("Book Detail : ");
        System.out.println(bookService.findById(1));
        System.out.println(bookService.size());
    }
}
