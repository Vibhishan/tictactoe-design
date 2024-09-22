package me.vibhishanranga.tictactoe.models;

public abstract class Player {
    private Symbol symbol;
    private PlayerType playerType;
    private String name;

    Player(PlayerType playerType, Symbol symbol) {
        this.symbol = symbol;
        this.playerType = playerType;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public abstract Move makeMove(Board board);
}
