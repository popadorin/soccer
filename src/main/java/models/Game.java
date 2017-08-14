package models;

import java.util.ArrayList;

public class Game {
    public Team homeTeam;
    public Team awayTeam;
    public ArrayList<Goal> goals;

    public Game() {}

    public Game(Team homeTeam, Team awayTeam, ArrayList<Goal> goals) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.goals = goals;
    }
}
