package TicTacToeGame;

import javafx.scene.control.Button;

/**
 * Implementation for gameplay logic.
 */
public class TicTacLogic {
    
    public static int turn = 0;
    private static int[][] boardState = new int[3][3];


    /**
     * Advances the turn and places player selection into the board state.
     * @param currentButton The current button that was pressed.
     */
    public static void advanceTurn(Button currentButton) {

        turn++;

        // Get current button ID and chop off the number portion of the ID. This always assume the button ID format has two numbers at the end of the string.
        String btn = currentButton.getId();
        int buttonID = Integer.parseInt(btn.substring(btn.length()-2, btn.length()));

        // Find equivalent row and column for the game board
        int row = (int) Math.floor(buttonID / 10) - 1;
        int col = (buttonID - 11) % 10;

        boardState[row][col] = getCurrentPlayer(); // Place player token into the board state.
    }


    /**
     * Checks if the current player has won the game by getting three X or O in a row in three orientations.
     * They can be vertical, horizontal, or diagonal.
     * @param currentButton The current pressed button.
     * @return Returns true if the current player won. Returns false otherwise.
     */
    public static boolean checkForWin(Button currentButton) {
        
        //Check for a vertical win (if X1, X2, X3 are the same)
        for(int col = 0; col < 3; col++) {

            if(boardState[0][col] == getCurrentPlayer()
                && boardState[1][col] == getCurrentPlayer()
                && boardState[2][col] == getCurrentPlayer())
                    return true;
        }
        // Check for horizontal win (if 1X, 2X, 3X are the same)
        for(int row = 0; row < 3; row++) {

            if(boardState[row][0] == getCurrentPlayer()
                && boardState[row][1] == getCurrentPlayer()
                && boardState[row][2] == getCurrentPlayer())
                    return true;
        }
        // Check for both diagonal orentations (if 11, 22, 33 OR 31, 22, 13 are the same)
        if(boardState[0][0] == getCurrentPlayer()
            && boardState[1][1] == getCurrentPlayer()
            && boardState[2][2] == getCurrentPlayer())
                return true;

        if(boardState[2][0] == getCurrentPlayer()
            && boardState[1][1] == getCurrentPlayer()
            && boardState[0][2] == getCurrentPlayer())
                return true;
        
        // Return false otherwise.
        return false;
    }


    /**
     * Gets the current player based on the turn of the game.
     * @return Returns 1 for player 1, returns 2 for player 2.
     */
    public static int getCurrentPlayer() {

        return (turn % 2 == 1) ? 1 : 2;
    }

    /**
     * Prints the internal board state to console, useful for debugging.
     */
    public static void printBoardState() {

        for(int row = 0; row < 3; row ++) {
            for(int col = 0; col < 3; col++) {

                System.out.print(boardState[row][col] + "\t");
            }
            System.out.println();
        }
    }
}
