package in.pavithra.lms;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashSet;
import java.util.Set;

@Controller
@EnableAutoConfiguration
public class User
{
    User user=new User();
    @RequestMapping(value="/user/book")
    @ResponseBody
    public Set<Book> addBorrow(@RequestBody Book book, User user){
        Set<Book> bookss=new HashSet<Book>();
        boolean add = bookss.add(book);
        return bookss;
    }


}
