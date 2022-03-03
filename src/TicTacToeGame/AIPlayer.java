package TicTacToeGame;

import TicTacToeGame.exceptions.GameNotStartedException;
import javafx.application.Platform;
import javafx.scene.control.Button;

/**
 * An AI player object that uses a minimax algorithm with alpha beta pruning.
 * This AI player also has the ability to interact with the TicTacToe board.
 * @author Matt De Binion
 */
public class AIPlayer extends Player {

    private int difficulty = 0;     // 0 = easy, 1 = medium, 2 = hard.
    private boolean thinking = false;
    private TicTacToeBoard GameLogic = TicTacToeBoard.getInstance();
    private Thread brain;

    public AIPlayer() throws GameNotStartedException {
        this(0);
    }

    public AIPlayer(int difficulty) throws GameNotStartedException {
        super(thinkOfRandomName());
        super.AI = true;    // Specify that this is now an EI player

        // Set difficulty
        if(difficulty >= 0 && difficulty <= 2) {
            this.difficulty = difficulty;
        } else {
            difficulty = 1;
        }
        think(); // One object is created, start thinking.
    }

    /**
     * Determines if the AI is currently thinking.
     * @return A boolean
     */
    public boolean isThinking() {
        return thinking;
    }

    /**
     * 
     */
    private void think() {

        // Create a new Thread that looks to see if it can play the current turn.
        brain = new Thread(new Runnable() {

            @Override
            public void run() {
                
                System.out.println(GameLogic.getAIPlayer().getPlayerName() + ": I am alive!");

                while(!brain.isInterrupted()) {
                    try {
                        Thread.sleep(250);  // Speed control the thread as going too fast breaks the game.
                        if(GameLogic.getCurrentPlayer().isAI() && !GameLogic.gameHasEnded()) {
                            Platform.runLater(new Runnable() {
                                @Override
                                public void run() {
                                    try {
                                        performMyNextMove();
                                    } catch (GameNotStartedException e) {
                                        e.printStackTrace();
                                    }
                                }

                            });
                        }
                            
                    } catch (InterruptedException e) {
                        brain.interrupt();
                    }
                }
                
            }
        });

        // If the thread is not running, start the thread as a Dameon thread
        if(!brain.isAlive()) {
            brain.setDaemon(true);  // Tells JVM that this thread is in the background and should be killed once application closes.
            brain.start();
        }
    }
    /**
     * I will determine the next optimal move based on the difficulty that I was created with.
     * @return True if my move advanced the turn. Returns false otherwise.
     * @throws GameNotStartedException Occurs when the started flag is FALSE.
     */
    private boolean performMyNextMove() throws GameNotStartedException {
        System.out.println(this.playerName + ": Trying move...");
        if(difficulty == 0) { 

                // Thinks of a random square combination and finds the next valid square.
                String randomSquareName = "#square" + thinkOfRandomNumber(1, 4) + thinkOfRandomNumber(1, 4);
                Button selectedButton = (Button) GameLogic.getGameScene().lookup(randomSquareName);

                return GameLogic.advanceTurn(selectedButton);
        }

        return false;

    }

    /**
     * I think of a a random number in a specified range.
     * @param min An integer inclusive
     * @param max An integer exclusive
     * @return A number between min and max.
     */
    private static int thinkOfRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }

    /**
     * I pick a random name from a list of names.
     */
    private static String thinkOfRandomName() {
        String[] names = {"Matt", "Nika", "Elihas"};
        return "AI " + names[thinkOfRandomNumber(0, names.length)];
    }
}
