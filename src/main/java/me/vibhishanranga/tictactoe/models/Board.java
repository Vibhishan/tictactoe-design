package me.vibhishanranga.tictactoe.models;

import java.util.List;

public class Board {
    private int dimension;
    private List<List<Cell>> board;

    public int getDimension() {
        return dimension;
    }

    Cell getCell(int row, int col) {
        return board.get(row).get(col);
    }

    public List<List<Cell>> getBoard() {
        return board;
    }
}
