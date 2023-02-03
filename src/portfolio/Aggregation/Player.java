package portfolio.Aggregation;

public class Player {
    String name;
    int id;
    String team;

    Player(String name, int id, String team) {
        this.name = name;
        this.id = id;
        this.team = team;
    }

    public String getName() {
        return name;
    }
}
