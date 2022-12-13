package it.develhope.javadoc;

/**
 * @author Giuseppe Iacono
 * class wordGames
 */
public class WordGames {

    /**
     * this method print Hello + String word
     * @param word that will be added to the Hello String
     * @return String
     */
    public String addHelloWord(String word){
        return "Hello " + word;
    }

    /**
     * this method print the concatenation of the String name + surname
     * @param name first String
     * @param surname second String
     * @return String
     */
    public String getFullName(String name, String surname){
        return name + " " + surname;
    }

}
