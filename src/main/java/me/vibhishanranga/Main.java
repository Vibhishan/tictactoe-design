package me.vibhishanranga;

import me.vibhishanranga.tictactoe.controllers.GameController;
import me.vibhishanranga.tictactoe.models.*;
import me.vibhishanranga.tictactoe.strategies.gameWinningStrategy.GameWinningStrategy;
import me.vibhishanranga.tictactoe.strategies.gameWinningStrategy.OrderOneGameWinningStrategy;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int dimension = 3;
        Player p1 = new HumanPlayer(new Symbol('X'));
        Player p2 = new Bot(new Symbol('O'), BotDifficultyLevel.EASY);
        GameWinningStrategy gameWinningStrategy = new OrderOneGameWinningStrategy();
        GameController gameController = new GameController();

        Game game = gameController.createGame(dimension, List.of(p1, p2), List.of(gameWinningStrategy));

        while(gameController.getGameStatus(game).equals(GameStatus.IN_PROGRESS)){
            System.out.println("Please make next move, this is the current status");
            gameController.display(game);
            gameController.makeMove(game);
        }

        if(gameController.getGameStatus(game).equals(GameStatus.ENDED)){
            System.out.println("WINNER");
            gameController.display(game);
        }

        if(gameController.getGameStatus(game).equals(GameStatus.DRAW)){
            System.out.println("DRAW, TRY AGAIN!");
            gameController.display(game);
        }
    }
}