package my.id.adityaariizkyy;

import my.id.adityaariizkyy.config.AppConfig;
import my.id.adityaariizkyy.service.impl.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext appCtx = new AnnotationConfigApplicationContext(AppConfig.class);
        BookServiceImpl bookService = appCtx.getBean("bookService", BookServiceImpl.class);
        System.out.println("Book Detail : ");
        System.out.println(bookService.findById(2L));
        System.out.println(bookService.size());
    }
}
