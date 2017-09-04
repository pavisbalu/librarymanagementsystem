package in.pavithra.lms;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class Librarian {
    @RequestMapping(value = "/book", method = RequestMethod.POST)
    @ResponseBody
    boolean add(@RequestBody Book book) {
        return Books.add(book);
    }
    @RequestMapping(value = "/book", method = RequestMethod.DELETE)
    @ResponseBody
    boolean remove(@RequestBody Book book) {
        return Books.remove(book);
    }
    @RequestMapping(value = "/book", method = RequestMethod.PUT)
    @ResponseBody
    public Book edit(@RequestBody Book input) {
        return Books.edit(input);
    }
}