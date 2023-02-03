package portfolio.Aggregation;

import java.util.List;

public class School {
    String schoolName;
    private List<Team> teams;

    School(String schoolName, List<Team> teams) {
        this.schoolName = schoolName;
        this.teams = teams;
    }

    public int getTotalPlayersInSchool() {
        int noOfPlayers = 0;
        List<Player> players;

        for(Team team : teams) {
            players = team.getPlayers();
            System.out.println(players);
            for(Player p : players) {
                noOfPlayers++;
                System.out.println(p.getName());
            }
        }
        return noOfPlayers;
    }
}
