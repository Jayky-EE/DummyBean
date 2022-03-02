package TicTacToeGame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


import java.io.IOException;

import TicTacToeGame.exceptions.GameNotStartedException;

public class TicTacGUIController {

    private Stage stage;
    private Scene scene;
    private Parent root;
    public static boolean PlayerOneMode;

    @FXML
    public void SetGameMode(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("fxml/SetPlayers.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML public void PlayerOneMode (ActionEvent event) throws IOException {
        PlayerOneMode = true;
        root = FXMLLoader.load(getClass().getResource("fxml/SetPlayerOne.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML public void PlayerTwoMode (ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("fxml/SetPlayerOne.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public String NamePlayerOne;
    public String NamePlayerTwo;

    @FXML
    public Button submitButton;
    @FXML
    private TextField PlayerOneNameInput;
    @FXML
    private Label EnterPlayOneNameLabel;

    @FXML
    public void getPlayerOneName (ActionEvent event) throws IOException, GameNotStartedException {
        NamePlayerOne = PlayerOneNameInput.getText();
        if (PlayerOneMode == true) {
            root = FXMLLoader.load(getClass().getResource("fxml/TicTacGUI.fxml"));

        } else {
            root = FXMLLoader.load(getClass().getResource("fxml/setPlayerTwo.fxml"));
        }
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        // Ensure scene is not null when being passed
        if(PlayerOneMode == true) {

            TicTacToeBoard GameLogic = TicTacToeBoard.getInstance();
            GameLogic.startGame(scene, NamePlayerOne, null);  // Start the game with custom name for player 1 and default player 2 name.

        }

    }

    @FXML
    public Button submitButton1;

    @FXML
    private TextField PlayerTwoNameInput;
    @FXML
    private Label EnterPlayTwoNameLabel;

    @FXML
    public void getPlayerTwoName (ActionEvent event) throws IOException, GameNotStartedException {
        NamePlayerTwo = PlayerTwoNameInput.getText();
        root = FXMLLoader.load(getClass().getResource("fxml/TicTacGUI.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        TicTacToeBoard GameLogic = TicTacToeBoard.getInstance();
        GameLogic.startGame(scene, NamePlayerOne, NamePlayerTwo); // Start game with custom names.
    }

    // Is this needed? Commented out until we decide to remove or not.
    /*
    @FXML
    public void switchToBoard(ActionEvent event) throws IOException, MaximumPlayersException {
         root = FXMLLoader.load(getClass().getResource("fxml/TicTacGUI.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        TicTacToeBoard.startGame(scene, null, null);
    }
    */

    /// temp switches to board until credits are implemented
    @FXML
    public void switchToCredits(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("fxml/Credits.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    // quit game
    @FXML
    private Button  quitButton;
    @FXML
    private AnchorPane startMenu;
    @FXML
    public void logout(ActionEvent event) throws IOException {
        stage = (Stage) startMenu.getScene().getWindow();
        stage.close();
    }
    /**
     * Restarts the game when the restart button is pressed.
     * @param event An action event
     * @throws Exception
     */
    @FXML
    private void newGame(ActionEvent event) throws Exception {
        TicTacToeBoard GameLogic = TicTacToeBoard.getInstance();
        GameLogic.resetGame();
    }

    /**
     * Goes to the main menu when the button is pressed.
     * @param event
     * @throws Exception
     */
    @FXML
    private void goToMainMenu(ActionEvent event) throws Exception {
        TicTacToeBoard GameLogic = TicTacToeBoard.getInstance();
        GameLogic.endGame();   // Ends the game.
        root = FXMLLoader.load(getClass().getResource("fxml/StartMenuGUI.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Gets the current button and checks if there is an existing "X" or "O"
     * If there is, place a corresponding X or O and increment TicTacToeBoard.turn.
     * If not, do nothing
     * @param event An action event (must be a Button)
     * @throws Exception
     */
    @FXML
    private void checkCurrentButton(ActionEvent event) throws Exception {

        TicTacToeBoard GameLogic = TicTacToeBoard.getInstance();
        // goto implementation to see new advancedTurn documentation
        GameLogic.advanceTurn((Button)event.getSource());
    }

}