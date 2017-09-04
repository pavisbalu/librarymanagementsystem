package in.pavithra.lms;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@EnableAutoConfiguration
public class Reader {
    /* @RequestMapping("/reader/browse")
     @ResponseBody
     List<Book> browse() {
         return Books.all();
     }
 */
    @RequestMapping(value = "/reader/browse",method = RequestMethod.GET)
    @ResponseBody
    List<Book> browse(@RequestParam(value = "author", required = false) String author,
                      @RequestParam(value = "title", required = false) String title,
                      @RequestParam(value = "year", required = false) Integer yearOfPublication) {

        List<Book> booksToReturn = Books.all();
        if (isNotEmpty(author)) booksToReturn = Books.filterByAuthor(booksToReturn, author);
        if (isNotEmpty(title)) booksToReturn = Books.filterByTitle(booksToReturn, title);
        if (yearOfPublication != null) booksToReturn = Books.filterByPublication(booksToReturn, yearOfPublication);

        return booksToReturn;
    }


    @RequestMapping(value = "/book", method = RequestMethod.PUT)
    @ResponseBody
    public Book borrow(@RequestBody Book input) {
        return Books.borrow(input);
    }

    public static boolean
    isEmpty(String input) {
        return input == null || input.isEmpty();
    }

    public static boolean isNotEmpty(String input) {
        return !isEmpty(input);
    }


}


