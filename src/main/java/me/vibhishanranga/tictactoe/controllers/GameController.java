package me.vibhishanranga.tictactoe.controllers;

import me.vibhishanranga.tictactoe.exceptions.EmptyMovesUndoOperationException;
import me.vibhishanranga.tictactoe.models.Game;
import me.vibhishanranga.tictactoe.models.GameStatus;
import me.vibhishanranga.tictactoe.models.Player;
import me.vibhishanranga.tictactoe.strategies.gameWinningStrategy.GameWinningStrategy;

import java.util.List;

public class GameController {
    public Game createGame(int dimensionOfBoard,
                           List<Player> players,
                           List<GameWinningStrategy> gameWinningStrategies){

        Game game = null;

        try{
            game = Game.create()
                    .setDimension(dimensionOfBoard)
                    .addAllPlayers(players)
                    .addAllGameWinningStrategies(gameWinningStrategies)
                    .build();
        } catch (Exception exception){
            System.out.println("Something wrong");
            exception.printStackTrace();
        }

        return game;
    }

    public void makeMove(Game game){
        game.makeMove();
    }

    public boolean undo(Game game) throws EmptyMovesUndoOperationException{
        return game.undo();
    }

    public Player getWinner(Game game){
        return game.getWinner();
    }

    public GameStatus getGameStatus(Game game) {
        return game.getGameStatus();
    }

    public void display(Game game) {
        game.getBoard().printBoard();
    }
}
