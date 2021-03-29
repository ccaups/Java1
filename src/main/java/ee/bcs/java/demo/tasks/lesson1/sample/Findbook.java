package ee.bcs.java.demo.tasks.lesson1.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Findbook {
    @GetMapping("book/test")
    public Book getBook() {
        Book raamat = new Book();
        raamat.setAuthor("Siim Rebane");
        raamat.setPublishedYear(2020);
        raamat.setTitle("Java world");
        return raamat;
    }
}
