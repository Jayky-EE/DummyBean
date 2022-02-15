import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class TicTacToeBoard extends Application {

    public static int turn = 0;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Tic Tac Toe Board");

        // Create buttons to represent squares in a tic tac toe game
        Button square11 = new Button("");
        Button square12 = new Button("");
        Button square13 = new Button("");
        Button square21 = new Button("");
        Button square22 = new Button("");
        Button square23 = new Button("");
        Button square31 = new Button("");
        Button square32 = new Button("");
        Button square33 = new Button("");

        // Define preferred size of squares
        double preferredButtonSize = 200;
        square11.setPrefSize(preferredButtonSize,preferredButtonSize);
        square12.setPrefSize(preferredButtonSize,preferredButtonSize);
        square13.setPrefSize(preferredButtonSize,preferredButtonSize);
        square21.setPrefSize(preferredButtonSize,preferredButtonSize);
        square22.setPrefSize(preferredButtonSize,preferredButtonSize);
        square23.setPrefSize(preferredButtonSize,preferredButtonSize);
        square31.setPrefSize(preferredButtonSize,preferredButtonSize);
        square32.setPrefSize(preferredButtonSize,preferredButtonSize);
        square33.setPrefSize(preferredButtonSize,preferredButtonSize);

        // Create grid and place squares according to row and column
        GridPane grid = new GridPane();
        grid.add(square11, 0, 0, 1,1);
        grid.add(square12, 1, 0, 1,1);
        grid.add(square13, 2, 0, 1,1);
        grid.add(square21, 0, 1, 1,1);
        grid.add(square22, 1, 1, 1,1);
        grid.add(square23, 2, 1, 1,1);
        grid.add(square31, 0, 2, 1,1);
        grid.add(square32, 1, 2, 1,1);
        grid.add(square33, 2, 2, 1,1);

        Scene scene = new Scene(grid, 600, 600);
        primaryStage.setScene(scene);
        primaryStage.show();

        // Handle button clicks by inserting (alternating between) an "X" or
        // an "O" if a symbol does not already exist in that square.
        // The variable, turn, is incremented after each valid click on a square in order
        // to alternate between the symbols
        square11.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                if(square11.getText() != "X" && square11.getText() != "O")
                {
                    turn++;
                    if(turn % 2 == 1) {
                        Font f = Font.font("Bookman Old Style", FontWeight.EXTRA_BOLD, 36);
                        square11.setFont(f);
                        square11.setText("X");
                        square11.setStyle("-fx-text-fill: green");
                    }
                    else {
                        Font f = Font.font("Bookman Old Style", FontWeight.EXTRA_BOLD, 36);
                        square11.setFont(f);
                        square11.setText("O");
                        square11.setStyle("-fx-text-fill: red");
                    }
                }
            }
        });
        square12.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                if(square12.getText() != "X" && square12.getText() != "O")
                {
                    turn++;
                    if(turn % 2 == 1) {
                        Font f = Font.font("Bookman Old Style", FontWeight.EXTRA_BOLD, 36);
                        square12.setFont(f);
                        square12.setText("X");
                        square12.setStyle("-fx-text-fill: green");
                    }
                    else {
                        Font f = Font.font("Bookman Old Style", FontWeight.EXTRA_BOLD, 36);
                        square12.setFont(f);
                        square12.setText("O");
                        square12.setStyle("-fx-text-fill: red");
                    }
                }
            }
        });
        square13.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                if(square13.getText() != "X" && square13.getText() != "O")
                {
                    turn++;
                    if(turn % 2 == 1) {
                        Font f = Font.font("Bookman Old Style", FontWeight.EXTRA_BOLD, 36);
                        square13.setFont(f);
                        square13.setText("X");
                        square13.setStyle("-fx-text-fill: green");
                    }
                    else {
                        Font f = Font.font("Bookman Old Style", FontWeight.EXTRA_BOLD, 36);
                        square13.setFont(f);
                        square13.setText("O");
                        square13.setStyle("-fx-text-fill: red");
                    }
                }
            }
        });
        square21.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                if(square21.getText() != "X" && square21.getText() != "O")
                {
                    turn++;
                    if(turn % 2 == 1) {
                        Font f = Font.font("Bookman Old Style", FontWeight.EXTRA_BOLD, 36);
                        square21.setFont(f);
                        square21.setText("X");
                        square21.setStyle("-fx-text-fill: green");
                    }
                    else {
                        Font f = Font.font("Bookman Old Style", FontWeight.EXTRA_BOLD, 36);
                        square21.setFont(f);
                        square21.setText("O");
                        square21.setStyle("-fx-text-fill: red");
                    }
                }
            }
        });
        square22.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                if(square22.getText() != "X" && square22.getText() != "O")
                {
                    turn++;
                    if(turn % 2 == 1) {
                        Font f = Font.font("Bookman Old Style", FontWeight.EXTRA_BOLD, 36);
                        square22.setFont(f);
                        square22.setText("X");
                        square22.setStyle("-fx-text-fill: green");
                    }
                    else {
                        Font f = Font.font("Bookman Old Style", FontWeight.EXTRA_BOLD, 36);
                        square22.setFont(f);
                        square22.setText("O");
                        square22.setStyle("-fx-text-fill: red");
                    }
                }
            }
        });
        square23.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                if(square23.getText() != "X" && square23.getText() != "O")
                {
                    turn++;
                    if(turn % 2 == 1) {
                        Font f = Font.font("Bookman Old Style", FontWeight.EXTRA_BOLD, 36);
                        square23.setFont(f);
                        square23.setText("X");
                        square23.setStyle("-fx-text-fill: green");
                    }
                    else {
                        Font f = Font.font("Bookman Old Style", FontWeight.EXTRA_BOLD, 36);
                        square23.setFont(f);
                        square23.setText("O");
                        square23.setStyle("-fx-text-fill: red");
                    }
                }
            }
        });
        square31.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                if(square31.getText() != "X" && square31.getText() != "O")
                {
                    turn++;
                    if(turn % 2 == 1) {
                        Font f = Font.font("Bookman Old Style", FontWeight.EXTRA_BOLD, 36);
                        square31.setFont(f);
                        square31.setText("X");
                        square31.setStyle("-fx-text-fill: green");
                    }
                    else {
                        Font f = Font.font("Bookman Old Style", FontWeight.EXTRA_BOLD, 36);
                        square31.setFont(f);
                        square31.setText("O");
                        square31.setStyle("-fx-text-fill: red");
                    }
                }
            }
        });
        square32.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                if(square32.getText() != "X" && square32.getText() != "O")
                {
                    turn++;
                    if(turn % 2 == 1) {
                        Font f = Font.font("Bookman Old Style", FontWeight.EXTRA_BOLD, 36);
                        square32.setFont(f);
                        square32.setText("X");
                        square32.setStyle("-fx-text-fill: green");
                    }
                    else {
                        Font f = Font.font("Bookman Old Style", FontWeight.EXTRA_BOLD, 36);
                        square32.setFont(f);
                        square32.setText("O");
                        square32.setStyle("-fx-text-fill: red");
                    }
                }
            }
        });
        square33.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                if(square33.getText() != "X" && square33.getText() != "O")
                {
                    turn++;
                    if(turn % 2 == 1) {
                        Font f = Font.font("Bookman Old Style", FontWeight.EXTRA_BOLD, 36);
                        square33.setFont(f);
                        square33.setText("X");
                        square33.setStyle("-fx-text-fill: green");
                    }
                    else {
                        Font f = Font.font("Bookman Old Style", FontWeight.EXTRA_BOLD, 36);
                        square33.setFont(f);
                        square33.setText("O");
                        square33.setStyle("-fx-text-fill: red");
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}