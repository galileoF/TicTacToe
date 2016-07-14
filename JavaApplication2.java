
package javaapplication2;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.stage.Stage;



public class JavaApplication2 extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("TicTAcToe");
        primaryStage.setResizable(false);
     

        GridPane gridPane = new GridPane();
        
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(8);
        gridPane.setHgap(10);
        gridPane.setMaxSize(290,240);
        gridPane.setAlignment(Pos.CENTER);
        
        
        Button btn1 = new Button("");
        GridPane.setConstraints(btn1,1,1);
        btn1.setMinSize(100, 100);
        //action
        btn1.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                btn1.setText("x");
            }
        });

        Button btn2 = new Button("");
        GridPane.setConstraints(btn2, 1,2);
        btn2.setMinSize(100, 100);
        
        Button btn3 = new Button("");
        GridPane.setConstraints(btn3, 1,3);
        btn3.setMinSize(100, 100);
        
        Button btn4 = new Button("");
        GridPane.setConstraints(btn4, 2,1);
        btn4.setMinSize(100, 100);
        
        Button btn5 = new Button("");
        GridPane.setConstraints(btn5, 2,2);
        btn5.setMinSize(100, 100);
        
        Button btn6 = new Button("");
        GridPane.setConstraints(btn6, 2,3);
        btn6.setMinSize(100, 100);
        
        Button btn7 = new Button("");
        GridPane.setConstraints(btn7, 3,1);
        btn7.setMinSize(100, 100);
        
        
        Button btn8 = new Button("");
        GridPane.setConstraints(btn8, 3,2);
        btn8.setMinSize(100, 100);
        
        Button btn9 = new Button("");
        GridPane.setConstraints(btn9, 3,3);
        btn9.setMinSize(100, 100);
        
        gridPane.getChildren().addAll(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9);
        

        MenuBar bar = new MenuBar();
        Menu game = new Menu("Game");
        Menu help = new Menu("Help");

        MenuItem gameNew = new MenuItem("New");
        MenuItem gameExit = new MenuItem("Exit");
        game.getItems().addAll(gameNew, gameExit);
        gameExit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Platform.exit();
            }
        });
        bar.getMenus().addAll(game, help);
        BorderPane layout = new BorderPane();
        layout.setTop(bar);
        layout.setCenter(gridPane);
        Scene scene = new Scene(layout, 400, 400);

        primaryStage.setScene(scene);
        primaryStage.show();


    }
            
    
}
