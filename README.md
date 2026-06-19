 Tic-Tac-Toe Game (Java OOP)

A simple console-based Tic Tac Toe game developed in Java using Object-Oriented Programming (OOP) principles.

## Features

- Two-player gameplay
- Console-based user interface
- Object-Oriented Design
- Uses:
  - Abstract Class
  - Interface
  - Inheritance
  - Encapsulation
  - Polymorphism
- Input validation
- Automatic win and draw detection

## Project Structure

```
tictactoe
│
├── Main.java
│
├── controller
│   └── GameController.java
│
└── playable
    ├── Player.java
    ├── HumanPlayer.java
    └── Playables.java
```

## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- VS Code

## How to Run

### Compile

```bash
javac tictactoe/Main.java
```

### Run

```bash
java tictactoe.Main
```



## Gameplay

1. Two players enter their names.
2. Players take turns entering row and column positions.
3. The game checks for:
   - Winner
   - Draw
   - Invalid moves
4. The game ends when a player wins or the board is full.
   
## Future Improvements

- Add Single Player mode with AI.
- Implement different difficulty levels (Easy, Medium, Hard).
- Create a graphical user interface (GUI) using Java Swing.
- Add score tracking and match history.



