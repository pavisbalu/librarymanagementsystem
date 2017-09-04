package in.pavithra.tictactoe;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class GameConteoller {
    @RequestMapping(value = "/game/get")
    @ResponseBody
    public int[][] getBoard() {
        return Game.getBoard();
    }

    @RequestMapping(value = "/game/clear")
    @ResponseBody
    public int[][] clear() {
        Game.clear();
        return Game.getBoard();
    }

    @RequestMapping(value = "game/play", method = RequestMethod.POST)
    @ResponseBody
    public int[][] play(@RequestBody Position position) {
        return Game.play(position.getRow(), position.getColumn());
    }
}


