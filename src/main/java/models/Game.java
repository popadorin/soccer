package models;

import java.util.ArrayList;

public class Game {
    public Team homeTeam;
    public Team awayTeam;
    public ArrayList<Goal> goals;

    public void printResults() {
        System.out.println("Barcelona: ");
        for (Player p : homeTeam.players) {
            System.out.println(p.name);
        }

        System.out.println("\nReal Madrid: ");
        for (Player p : awayTeam.players) {
            System.out.println(p.name);
        }

        System.out.println("\nGoals:");

        for (Goal goal : goals) {
            System.out.println("Goal scored after " + goal.time + " mins by " + goal.player + " of the " +
                    goal.team.name + " team.");
        }
    }
}
