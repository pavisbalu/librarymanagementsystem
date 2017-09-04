package in.pavithra.practicesum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration

public class SumNumbers {
    @RequestMapping(value="/sum",method = RequestMethod.GET)
    @ResponseBody
    int sum(int a,int b) {
        return a+b;
    }
    public static void main(String[] args) {
        SpringApplication.run(SumNumbers.class,args);
    }
}


