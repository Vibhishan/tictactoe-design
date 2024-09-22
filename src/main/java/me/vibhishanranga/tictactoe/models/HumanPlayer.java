package me.vibhishanranga.tictactoe.models;

import java.util.Scanner;

public class HumanPlayer extends Player{

    public HumanPlayer(Symbol symbol){
        super(PlayerType.HUMAN, symbol);
    }

    @Override
    public Move makeMove(Board board){
        Scanner myObject = new Scanner(System.in);

        System.out.println("Tell row number starting from 1");
        int row = myObject.nextInt();

        System.out.println("Tell column number starting from 1");
        int col = myObject.nextInt();

        Move move = new Move();

        move.setCell(board.getCell(row -1, col-1));
        move.setPlayer(this);
        move.setSymbol(this.getSymbol());

        return move;
    }
}
