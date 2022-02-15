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

    // Handle button clicks by inserting (alternating between) an "X" or
    // an "O" if a symbol does not already exist in that square.
    // The variable, turn, is incremented after each valid click on a square in order
    // to alternate between the symbols
    public void checkPrint(Button square) {
        square.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                if(square.getText() != "X" && square.getText() != "O")
                {
                    turn++;
                    if(turn % 2 == 1) {
                        Font f = Font.font("Bookman Old Style", FontWeight.EXTRA_BOLD, 36);
                        square.setFont(f);
                        square.setText("X");
                        square.setStyle("-fx-text-fill: green");
                    }
                    else {
                        Font f = Font.font("Bookman Old Style", FontWeight.EXTRA_BOLD, 36);
                        square.setFont(f);
                        square.setText("O");
                        square.setStyle("-fx-text-fill: red");
                    }
                }
            }
        });
    }

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

        // Print a symbol if an empty square is selected
        checkPrint(square11);
        checkPrint(square12);
        checkPrint(square13);
        checkPrint(square21);
        checkPrint(square22);
        checkPrint(square23);
        checkPrint(square31);
        checkPrint(square32);
        checkPrint(square33);

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}