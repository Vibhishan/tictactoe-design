# Command Line TicTacToe

A Java-based command-line implementation of the classic TicTacToe game showcasing various object-oriented design patterns and principles.

## Introduction

This project demonstrates the application of software design patterns in a simple yet comprehensive TicTacToe game. The game supports:

- Human vs Human gameplay
- Human vs Bot gameplay
- Configurable board dimensions
- Undo functionality
- Multiple winning strategies

## Design Patterns Implemented

### 1. Builder Pattern

- Used in `Game` class to construct complex game objects step by step
- Provides a clear and fluent API for game creation
- Validates game configuration before building (e.g., no multiple bots allowed)

### 2. Strategy Pattern

- `GameWinningStrategy` - Defines different algorithms for determining win conditions
- `BotPlayingStrategy` - Encapsulates different bot playing algorithms (currently includes random moves)
- Allows for easy extension with new strategies without modifying existing code

### 3. Factory Method Pattern

- Game creation is handled by the `GameController`, which acts as a factory for game instances
- Abstracts the complex instantiation logic from the client code

### 4. MVC Pattern

- **Models**: `Game`, `Board`, `Cell`, `Player`, etc. represent the core data structures
- **Controllers**: `GameController` manages game flow and interactions
- **View**: Board display functionality encapsulated in the `Board` class

### 5. Template Method Pattern

- Abstract `Player` class defines the structure for player behavior
- Concrete implementations (`HumanPlayer`, `Bot`) provide specific implementations

## Project Structure

- **controllers/**: Contains the `GameController` for handling game operations
- **models/**: Core game entities and data structures
- **strategies/**: Various interchangeable algorithms
  - **gameWinningStrategy/**: Strategies for determining win conditions
  - **botPlayingStrategies/**: Strategies for bot moves
- **exceptions/**: Custom exceptions for game-specific error handling
- **factories/**: Factory classes for object creation

## How to Play

The game is started from the `Main` class. Players take turns to make moves on the board. The first player to form a line (horizontal, vertical, or diagonal) of their symbols wins. If the board fills up without a winner, the game ends in a draw.

## Key Features

- Dynamic board size configuration
- Support for multiple types of players (human, bot)
- Configurable bot difficulty levels
- Extendable winning strategies
- Move history tracking with undo capability
- Clean separation of concerns through design patterns

## Requirements

- Java 22 or higher
- Maven for dependency management

## Future Enhancements

- Add more sophisticated bot playing strategies (minimax algorithm)
- Implement additional winning strategies for different game variations
- Create a graphical user interface
- Add network play capability
