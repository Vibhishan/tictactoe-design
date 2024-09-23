package me.vibhishanranga.tictactoe.exceptions;

public class EmptyMovesUndoOperationException extends Exception{

    public EmptyMovesUndoOperationException(){
        super("Undo operation was called while no moves exist");
    }
}
