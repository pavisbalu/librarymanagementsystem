package in.pavithra.tictactoe;

import org.springframework.boot.SpringApplication;

public class Spring {
    public static void main(String[] args) {
        Class Controllers[]={GameConteoller.class,Spring.class};
        SpringApplication.run(Controllers,args);

    }
}
