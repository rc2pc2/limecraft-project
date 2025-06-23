package org.lessons.java.boolz.ric.lime.logic;

import java.time.LocalDateTime;

public class GameHandler {
    private LocalDateTime gameStarted;
    private LocalDateTime gameEnded;

    public GameHandler() {
        this.gameStarted = LocalDateTime.now();
    }

    public LocalDateTime getGameStarted() {
        return this.gameStarted;
    }

    public void setGameStarted(LocalDateTime gameStarted) {
        this.gameStarted = gameStarted;
    }

    public LocalDateTime getGameEnded() {
        return this.gameEnded;
    }

    public void setGameEnded(LocalDateTime gameEnded) {
        this.gameEnded = gameEnded;
    }


    static void startNewGame(){}
    static void gameOver(){}
    static void pause(){}
    static void save(){}
}
