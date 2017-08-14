package models;

public class Goal {
    public Team team;
    public Player player;
    public double time;

    public Goal(Team team, Player player, double time) {
        this.team = team;
        this.player = player;
        this.time = time;
    }
}
