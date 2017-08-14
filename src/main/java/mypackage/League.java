package mypackage;

import models.Game;
import models.Goal;
import models.Player;
import models.Team;

import java.util.ArrayList;

public class League {
    public static void main(String[] args) {
        Game game = new Game();

        Player p1 = new Player("Messi");
        Player p2 = new Player("Busquets");
        Player p3 = new Player("Iniesta");
        Player p4 = new Player("Ronaldo");
        Player p5 = new Player("Modric");
        Player p6 = new Player("Bale");

        game.homeTeam = new Team("Barcelona", new ArrayList<Player>());
        game.awayTeam = new Team("Real Madrid", new ArrayList<Player>());

        game.homeTeam.players.add(p1);
        game.homeTeam.players.add(p2);
        game.homeTeam.players.add(p3);

        game.awayTeam.players.add(p4);
        game.awayTeam.players.add(p5);
        game.awayTeam.players.add(p6);

        Goal g1 = new Goal(game.homeTeam, p1, 20);
        Goal g2 = new Goal(game.homeTeam, p1, 65);
        Goal g3 = new Goal(game.awayTeam, p4, 80);

        game.goals = new ArrayList<Goal>();
        game.goals.add(g1);
        game.goals.add(g2);
        game.goals.add(g3);

        // print the results
        game.printResults();

    }
}
