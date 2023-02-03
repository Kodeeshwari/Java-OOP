package portfolio.Aggregation;

import java.util.*;

public class Main {
    public static void main (String[] args) {
        /* Declaring all the players */
        Player p1 = new Player("Harris", 1, "Red");
        Player p2 = new Player("Carol", 2, "Red");
        Player p3 = new Player("Johnny", 1, "Blue");
        Player p4 = new Player("Sarah", 2, "Blue");

    /* Making a List of
        "Red" team Players. */
        List <Player> red_players = new ArrayList<Player>();
        red_players.add(p1);
        red_players.add(p2);

    /* Making a List of
        "Blue" team Players. */
        List <Player> blue_players = new ArrayList<Player>();
        blue_players.add(p3);
        blue_players.add(p4);

        /* Declaring Team objects */
        Team red = new Team("Red", red_players);
        Team blue = new Team("Blue", blue_players);

        // Creating a list of teams and adding "red" and "blue" teams to it.
        List <Team> teams = new ArrayList<Team>();
        teams.add(red);
        teams.add(blue);

        // Creating an instance of School.
        School mySchool = new School("ABC", teams);

        System.out.println("Total players in my school: ");
        // Getting total prayers in the school.
        System.out.println(mySchool.getTotalPlayersInSchool());
    }
}
