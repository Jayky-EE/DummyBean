package TicTacToeGame;

import TicTacToeGame.exceptions.GameNotStartedException;
import javafx.scene.control.Button;

/**
 * An AI player object that uses a minimax algorithm with alpha beta pruning.
 * This AI player also has the ability to interact with the TicTacToe board.
 * @author Matt De Binion
 */
public class AIPlayer extends Player {

    private int difficulty = 0;     // 0 = easy, 1 = medium, 2 = hard.
    private boolean isPerforming = false;
    private TicTacToeBoard GameLogic = TicTacToeBoard.getInstance();
    private Thread brain;

    public AIPlayer() throws GameNotStartedException {
        this(0);
    }

    public AIPlayer(int difficulty) throws GameNotStartedException {
        super("AI");
        super.AI = true;
        this.difficulty = difficulty;

        startThinking();
    }

    private void startThinking() {
        brain = new Thread(new Runnable() {

            @Override
            public void run() {
                
                System.out.println("Brain starting!");
                while(true) {

                    System.out.println("The current player, " + GameLogic.getCurrentPlayer().getPlayerName() + ", an AI? " + GameLogic.getCurrentPlayer().isAI());
                }
                
            }
        });

        brain.start();
    }
    /**
     * I will determine the next optimal move based on the difficulty that I was created with.
     * @return True if my move advanced the turn. Returns false otherwise.
     * @throws GameNotStartedException Occurs when the started flag is FALSE.
     */
    public boolean performMyNextMove() throws GameNotStartedException {

        if(difficulty == 0) { 

                // Thinks of a random square combination and finds the next valid square.
                String randomSquareName = "#square" + thinkOfRandomNumber(1, 4) + thinkOfRandomNumber(1, 4);
                Button selectedButton = (Button) GameLogic.getGameScene().lookup(randomSquareName);

                System.out.println("I am trying " + randomSquareName);

                //If AI finds the next valid move, set isPerforming to off so other player can do something.

                return GameLogic.advanceTurn(selectedButton);
        }

        return false;

    }

    /**
     * I think of a a random number in a specified range.
     * @param min An integer
     * @param max An integer
     * @return A number between min and max.
     */
    public int thinkOfRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }

    /**
     * Determines if the AI is performing an action.
     * @return A boolean
     */
    public boolean isPerforming() {
        return isPerforming;
    }
}
