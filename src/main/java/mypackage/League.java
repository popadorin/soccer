package mypackage;

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
    }
}
