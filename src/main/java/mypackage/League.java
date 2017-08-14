package mypackage;

import models.Goal;
import models.Player;
import models.Team;

import java.util.ArrayList;

public class League {
    public static void main(String[] args) {
        Player p1 = new Player();
        p1.name = "Messi";
        Player p2 = new Player();
        p2.name = "Busquets";
        Player p3 = new Player();
        p3.name = "Iniesta";
        Player p4 = new Player();

        p4.name = "Ronaldo";
        Player p5 = new Player();
        p5.name = "Modric";
        Player p6 = new Player();
        p6.name = "Bale";

        Team t1 = new Team();
        t1.name = "Barcelona";
        t1.players = new ArrayList<Player>();

        Team t2 = new Team();
        t2.name = "Real Madrid";
        t2.players = new ArrayList<Player>();

        t1.players.add(p1);
        t1.players.add(p2);
        t1.players.add(p3);

        t2.players.add(p4);
        t2.players.add(p5);
        t2.players.add(p6);

        System.out.println("Barcelona: ");
        for (Player p : t1.players) {
            System.out.println(p.name);
        }

        System.out.println("\nReal Madrid: ");
        for (Player p : t2.players) {
            System.out.println(p.name);
        }


        Goal g1 = new Goal();
        Goal g2 = new Goal();
        Goal g3 = new Goal();

        g1.team = t1;
        g1.player = p1;
        g1.time = 20.0;

        g2.team = t1;
        g2.player = p1;
        g2.time = 29.0;

        g3.team = t2;
        g3.player = p4;
        g3.time = 80;

        ArrayList<Goal> goals = new ArrayList<Goal>();
        goals.add(g1);
        goals.add(g2);
        goals.add(g3);

        System.out.println(" ");
        System.out.println("Goals:");

        for(Goal goal : goals) {
            System.out.println("Goal scored after " + goal.time + " mins by " + goal.player.name + " of the " + goal.team.name + " team.");
        }



    }
}
