package com.linkedin.javacodechallenges;

/**
 * Hello world!
 *
 */
public class App {
    // This is a game that will randomly give
    // 10 points and you can decide for yourself if
    // you want to leave with the 10 point or continue playing
    // If continuing you can loose all the points
    public static void main(String[] args) {
        DoubleOrNothing game = new DoubleOrNothing();
        game.playGame();
    }
}
