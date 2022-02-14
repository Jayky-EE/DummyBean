import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TicTacToeBoard extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Tic Tac Toe Board");

        Button square11 = new Button("1");
        Button square12 = new Button("2");
        Button square13 = new Button("3");
        Button square21 = new Button("4");
        Button square22 = new Button("5");
        Button square23 = new Button("6");
        Button square31 = new Button("7");
        Button square32 = new Button("8");
        Button square33 = new Button("9");

        double preferredButtonSize = 200;

        square11.setStyle("-fx-text-fill: #0000ff");
        square11.setPrefSize(preferredButtonSize,preferredButtonSize);
        square12.setStyle("-fx-text-fill: #0000ff");
        square12.setPrefSize(preferredButtonSize,preferredButtonSize);
        square13.setStyle("-fx-text-fill: #0000ff");
        square13.setPrefSize(preferredButtonSize,preferredButtonSize);
        square21.setStyle("-fx-text-fill: #0000ff");
        square21.setPrefSize(preferredButtonSize,preferredButtonSize);
        square22.setStyle("-fx-text-fill: #0000ff");
        square22.setPrefSize(preferredButtonSize,preferredButtonSize);
        square23.setStyle("-fx-text-fill: #0000ff");
        square23.setPrefSize(preferredButtonSize,preferredButtonSize);
        square31.setStyle("-fx-text-fill: #0000ff");
        square31.setPrefSize(preferredButtonSize,preferredButtonSize);
        square32.setStyle("-fx-text-fill: #0000ff");
        square32.setPrefSize(preferredButtonSize,preferredButtonSize);
        square33.setStyle("-fx-text-fill: #0000ff");
        square33.setPrefSize(preferredButtonSize,preferredButtonSize);


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

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}