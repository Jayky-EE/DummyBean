package TicTacToeGame;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class TicTacGUIController {

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