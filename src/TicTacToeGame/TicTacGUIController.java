package TicTacToeGame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class TicTacGUIController {

    public static int turn = 0;

    @FXML
    private Button square11, square12, square13, square21, square22, square23, square31, square32, square33;

    // Handle button clicks by inserting (alternating between) an "X" or
    // an "O" if a symbol does not already exist in that square.
    // The variable, turn, is incremented after each valid click on a square in order
    // to alternate between the symbols
    @FXML
    private void checkPrint11(ActionEvent event) throws Exception{
        if(square11.getText() != "X" && square11.getText() != "O")
        {
            turn++;
            if(turn % 2 == 1) {
                Font f = Font.font("Bookman Old Style", FontWeight.EXTRA_BOLD, 64);
                square11.setFont(f);
                square11.setText("X");
                square11.setStyle("-fx-text-fill: green");
            }
            else {
                Font f = Font.font("Bookman Old Style", FontWeight.EXTRA_BOLD, 64);
                square11.setFont(f);
                square11.setText("O");
                square11.setStyle("-fx-text-fill: red");
            }
        }
    }

    @FXML
    private void checkPrint12(ActionEvent event) throws Exception{
        if(square12.getText() != "X" && square12.getText() != "O")
        {
            turn++;
            if(turn % 2 == 1) {
                Font f = Font.font("Bookman Old Style", FontWeight.EXTRA_BOLD, 64);
                square12.setFont(f);
                square12.setText("X");
                square12.setStyle("-fx-text-fill: green");
            }
            else {
                Font f = Font.font("Bookman Old Style", FontWeight.EXTRA_BOLD, 64);
                square12.setFont(f);
                square12.setText("O");
                square12.setStyle("-fx-text-fill: red");
            }
        }
    }

    @FXML
    private void checkPrint13(ActionEvent event) throws Exception{
        if(square13.getText() != "X" && square13.getText() != "O")
        {
            turn++;
            if(turn % 2 == 1) {
                Font f = Font.font("Bookman Old Style", FontWeight.EXTRA_BOLD, 64);
                square13.setFont(f);
                square13.setText("X");
                square13.setStyle("-fx-text-fill: green");
            }
            else {
                Font f = Font.font("Bookman Old Style", FontWeight.EXTRA_BOLD, 64);
                square13.setFont(f);
                square13.setText("O");
                square13.setStyle("-fx-text-fill: red");
            }
        }
    }

    @FXML
    private void checkPrint21(ActionEvent event) throws Exception{
        if(square21.getText() != "X" && square21.getText() != "O")
        {
            turn++;
            if(turn % 2 == 1) {
                Font f = Font.font("Bookman Old Style", FontWeight.EXTRA_BOLD, 64);
                square21.setFont(f);
                square21.setText("X");
                square21.setStyle("-fx-text-fill: green");
            }
            else {
                Font f = Font.font("Bookman Old Style", FontWeight.EXTRA_BOLD, 64);
                square21.setFont(f);
                square21.setText("O");
                square21.setStyle("-fx-text-fill: red");
            }
        }
    }

    @FXML
    private void checkPrint22(ActionEvent event) throws Exception{
        if(square22.getText() != "X" && square22.getText() != "O")
        {
            turn++;
            if(turn % 2 == 1) {
                Font f = Font.font("Bookman Old Style", FontWeight.EXTRA_BOLD, 64);
                square22.setFont(f);
                square22.setText("X");
                square22.setStyle("-fx-text-fill: green");
            }
            else {
                Font f = Font.font("Bookman Old Style", FontWeight.EXTRA_BOLD, 64);
                square22.setFont(f);
                square22.setText("O");
                square22.setStyle("-fx-text-fill: red");
            }
        }
    }

    @FXML
    private void checkPrint23(ActionEvent event) throws Exception{
        if(square23.getText() != "X" && square23.getText() != "O")
        {
            turn++;
            if(turn % 2 == 1) {
                Font f = Font.font("Bookman Old Style", FontWeight.EXTRA_BOLD, 64);
                square23.setFont(f);
                square23.setText("X");
                square23.setStyle("-fx-text-fill: green");
            }
            else {
                Font f = Font.font("Bookman Old Style", FontWeight.EXTRA_BOLD, 64);
                square23.setFont(f);
                square23.setText("O");
                square23.setStyle("-fx-text-fill: red");
            }
        }
    }

    @FXML
    private void checkPrint31(ActionEvent event) throws Exception{
        if(square31.getText() != "X" && square31.getText() != "O")
        {
            turn++;
            if(turn % 2 == 1) {
                Font f = Font.font("Bookman Old Style", FontWeight.EXTRA_BOLD, 64);
                square31.setFont(f);
                square31.setText("X");
                square31.setStyle("-fx-text-fill: green");
            }
            else {
                Font f = Font.font("Bookman Old Style", FontWeight.EXTRA_BOLD, 64);
                square31.setFont(f);
                square31.setText("O");
                square31.setStyle("-fx-text-fill: red");
            }
        }
    }

    @FXML
    private void checkPrint32(ActionEvent event) throws Exception{
        if(square32.getText() != "X" && square32.getText() != "O")
        {
            turn++;
            if(turn % 2 == 1) {
                Font f = Font.font("Bookman Old Style", FontWeight.EXTRA_BOLD, 64);
                square32.setFont(f);
                square32.setText("X");
                square32.setStyle("-fx-text-fill: green");
            }
            else {
                Font f = Font.font("Bookman Old Style", FontWeight.EXTRA_BOLD, 64);
                square32.setFont(f);
                square32.setText("O");
                square32.setStyle("-fx-text-fill: red");
            }
        }
    }

    @FXML
    private void checkPrint33(ActionEvent event) throws Exception{
        if(square33.getText() != "X" && square33.getText() != "O")
        {
            turn++;
            if(turn % 2 == 1) {
                Font f = Font.font("Bookman Old Style", FontWeight.EXTRA_BOLD, 64);
                square33.setFont(f);
                square33.setText("X");
                square33.setStyle("-fx-text-fill: green");
            }
            else {
                Font f = Font.font("Bookman Old Style", FontWeight.EXTRA_BOLD, 64);
                square33.setFont(f);
                square33.setText("O");
                square33.setStyle("-fx-text-fill: red");
            }
        }
    }
}