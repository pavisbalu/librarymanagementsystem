package in.pavithra.lms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class Greeting {
    public static class Response {
        private String name;
        private long timestamp;

        public String getName() {
            return name;
        }

        public Response setName(String name) {
            this.name = name;
            return this;
        }

        public long getTimestamp() {
            return timestamp;
        }

        public Response setTimestamp(long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
    }


    @RequestMapping("/greeting/name/")
    @ResponseBody
    public Response home() {
        return new Response().setName("Pavithra").setTimestamp(System.currentTimeMillis());
    }

    public static void main(String[] args) {
        Class controllers[] = {Greeting.class, Reader.class,Librarian.class};
        SpringApplication.run(controllers, args);
    }
}

