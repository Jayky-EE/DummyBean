package TicTacToeGame;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.event.ActionEvent;


import javax.swing.*;
import java.io.IOException;

public class TicTacGUIController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    public static boolean PlayerOneMode;
    @FXML
    public void SetGameMode(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("SetPlayers.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML public void PlayerOneMode (ActionEvent event) throws IOException {
        PlayerOneMode = true;
        root = FXMLLoader.load(getClass().getResource("SetPlayerOne.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML public void PlayerTwoMode (ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("SetPlayerOne.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public static String NamePlayerOne;
    public static String NamePlayerTwo;

    @FXML
    public Button submitButton;
    @FXML
    private TextField PlayerOneNameInput;
    @FXML
    private Label EnterPlayOneNameLabel;


    public void getPlayerOneName (ActionEvent event) throws IOException {
        NamePlayerOne = PlayerOneNameInput.getText();
        if (PlayerOneMode == true)
            root = FXMLLoader.load(getClass().getResource("TicTacGUI.fxml"));
        else
            root = FXMLLoader.load(getClass().getResource("setPlayerTwo.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public Button submitButton1;
    @FXML
    private TextField PlayerTwoNameInput;
    @FXML
    private Label EnterPlayTwoNameLabel;

    public void getPlayerTwoName (ActionEvent event) throws IOException{
        NamePlayerTwo = PlayerTwoNameInput.getText();
        root = FXMLLoader.load(getClass().getResource("TicTacGUI.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }



    @FXML
    public void switchToBoard(ActionEvent event) throws IOException {
         root = FXMLLoader.load(getClass().getResource("TicTacGUI.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    /// temp switches to board until credits are implemented
    @FXML
    public void switchToCredits(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Credits.fxml"));
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
     * Gets the current button and checks if there is an existing "X" or "O"
     * If there is, place a corresponding X or O and increment TicTacLogic.turn.
     * If not, do nothing
     * @param event An action event (must be a Button)
     * @throws Exception
     */
    @FXML
    private void checkCurrentButton(ActionEvent event) throws Exception {

        // Cast the event source as a button in order to get which button was pressed using getID method.
        Button pressedButton = (Button)event.getSource();

        // Elihas code for determining X and O of button.
        if(pressedButton.getText() != "X" && pressedButton.getText() != "O") {
            
            TicTacLogic.advanceTurn(pressedButton);

            if(TicTacLogic.getCurrentPlayer() == 1) {
                Font f = Font.font("Bookman Old Style", FontWeight.EXTRA_BOLD, 64);
                pressedButton.setFont(f);
                pressedButton.setText("X");
                pressedButton.setStyle("-fx-text-fill: green");
            }
            else {
                Font f = Font.font("Bookman Old Style", FontWeight.EXTRA_BOLD, 64);
                pressedButton.setFont(f);
                pressedButton.setText("O");
                pressedButton.setStyle("-fx-text-fill: red");
            }

            // When a player wins, disable buttons and highlight where game was won.
            if(TicTacLogic.checkForWin(pressedButton)) {
                System.out.println("PLAYER " + TicTacLogic.getCurrentPlayer() + " HAS WON!");

                // Get the scene and disable the GridPane
                Scene gameScene = pressedButton.getScene();
                gameScene.lookup("GridPane").setDisable(true);
                
            }
        }
    }

}