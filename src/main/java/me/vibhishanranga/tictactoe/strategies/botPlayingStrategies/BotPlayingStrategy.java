package me.vibhishanranga.tictactoe.strategies.botPlayingStrategies;

import me.vibhishanranga.tictactoe.models.Board;
import me.vibhishanranga.tictactoe.models.Move;
import me.vibhishanranga.tictactoe.models.Player;

public interface BotPlayingStrategy {
    Move makeNextMove(Board board, Player player);
}
