package in.pavithra.lms;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class Borrow {
    @RequestMapping
    @ResponseBody
    public Book Borrow(Book b,User user){
        Book book = b.setBorrowedBy(user);
        user.addBorrow(book, user);
        return  book;

    }
}
