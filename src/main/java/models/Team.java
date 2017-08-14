package models;

import java.util.List;

public class Team {
    public String name;
    public List<Player> players;

    public Team(String name, List<Player> players) {
        this.name = name;
        this.players = players;
    }
}
