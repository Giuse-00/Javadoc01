package it.develhope.javadoc;

/**
 * @author Giuseppe Iacono
 * class Tester
 */
public class Tester {

    public static void main(String[] args) {

        WordGames games = new WordGames();

        System.out.println(games.addHelloWord("world"));
        System.out.println(games.getFullName("Giuseppe", "Iacono"));



    }
}
