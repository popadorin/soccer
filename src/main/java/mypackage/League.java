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

        Team t1 = new Team("Barcelona", new ArrayList<Player>());
        Team t2 = new Team("Real Madrid", new ArrayList<Player>());

        t1.players.add(p1);
        t1.players.add(p2);
        t1.players.add(p3);

        t2.players.add(p4);
        t2.players.add(p5);
        t2.players.add(p6);

        Goal g1 = new Goal(t1, p1, 20);
        Goal g2 = new Goal(t1, p1, 65);
        Goal g3 = new Goal(t2, p4, 80);

        ArrayList<Goal> goals = new ArrayList<Goal>();
        goals.add(g1);
        goals.add(g2);
        goals.add(g3);

        game = new Game(t1, t2, goals);

        System.out.println("Barcelona: ");
        for (Player p : t1.players) {
            System.out.println(p.name);
        }

        System.out.println("\nReal Madrid: ");
        for (Player p : t2.players) {
            System.out.println(p.name);
        }

        System.out.println(" ");
        System.out.println("Goals:");

        for (Goal goal : goals) {
            System.out.println("Goal scored after " + goal.time + " mins by " + goal.player + " of the " +
                    goal.team.name + " team.");
        }

    }
}
