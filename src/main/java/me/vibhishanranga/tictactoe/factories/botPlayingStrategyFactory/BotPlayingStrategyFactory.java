package me.vibhishanranga.tictactoe.factories.botPlayingStrategyFactory;

import me.vibhishanranga.tictactoe.models.BotDifficultyLevel;
import me.vibhishanranga.tictactoe.strategies.botPlayingStrategies.BotPlayingStrategy;
import me.vibhishanranga.tictactoe.strategies.botPlayingStrategies.RandomBotPlayingStrategy;

public class BotPlayingStrategyFactory {
    public BotPlayingStrategy createBotPlayingStrategyForDifficultyLevel(BotDifficultyLevel difficultyLevel){
        return switch (difficultyLevel){
            case EASY, MEDIUM, HARD -> new RandomBotPlayingStrategy();
        };
    }
}
