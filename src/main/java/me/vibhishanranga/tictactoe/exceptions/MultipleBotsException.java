package me.vibhishanranga.tictactoe.exceptions;

public class MultipleBotsException extends Exception{
    public MultipleBotsException(){
        super("More than 1 bot is not allowed");
    }
}
