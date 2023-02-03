package portfolio.Aggregation;

import java.util.List;

public class Team {
    String name;
    private List<Player> players;

    Team(String name, List<Player> players) {
        this.name = name;
        this.players = players;
    }

    public List<Player> getPlayers() { // This function returns the "players"
        return players;
    }
}
