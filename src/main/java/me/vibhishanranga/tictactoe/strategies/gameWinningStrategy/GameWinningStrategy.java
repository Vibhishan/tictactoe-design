package me.vibhishanranga.tictactoe.strategies.gameWinningStrategy;

import me.vibhishanranga.tictactoe.models.Board;
import me.vibhishanranga.tictactoe.models.Cell;
import me.vibhishanranga.tictactoe.models.Player;

public interface GameWinningStrategy {
    boolean checkIfWon(Board board, Player player, Cell moveCell);
}
