package com.company;

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import javafx.scene.image.ImageView;


// Face IS-A Application ==> Inheritance
public class Facebook extends Application{
    // Face HAS-A Scene that uses BorderPane as its Layout Pane
    private Scene scene;
    private BorderPane sceneLayout;
    private GridPane gridPane = new GridPane();
    //uses a GridPane with 2 Labels, a TextField a PasswordField and 2 buttons
    private Label lbEmail,lbPassword;
    private TextField tfEmail;
    private PasswordField pfPassword;
    private Button btLogin,btSignUp;
    private Color WHITE = Color.WHITE;
    //An image of the Facebook Logo
    Image image = new Image("https://i.imgur.com/sC09SSE.png");
    @Override
    public void start(Stage primaryStage){
        // Construct the BorderPane node called sceneLayout...
        sceneLayout = new BorderPane();
        // Create a scene and place it in the stage
        scene = new Scene(sceneLayout);
        //setBackround of the gridpane to white
        gridPane.setBackground(new Background(new BackgroundFill(Color.WHITE,CornerRadii.EMPTY,
                Insets.EMPTY)));
        //set a black border around gridpane
        gridPane.setBorder(new Border(new BorderStroke(Color.BLACK,
                BorderStrokeStyle.SOLID,
                new CornerRadii(0),
                new BorderWidths(1))));
        gridPane.add(btLogin = new Button("Log In"),2,0);
        btLogin.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        btLogin.setBorder(new Border(new BorderStroke(Color.BLACK,
                BorderStrokeStyle.SOLID,
                new CornerRadii(0),
                new BorderWidths(1))));
        btLogin.setBackground(new Background(new BackgroundFill(Color.ALICEBLUE,CornerRadii.EMPTY,
                Insets.EMPTY)));
        //btLogin.setStyle(new Color(240,248,255););
        gridPane.add(btSignUp = new Button("Sign Up"),2,1);
        btSignUp.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        btSignUp.setBorder(new Border(new BorderStroke(Color.BLACK,
                BorderStrokeStyle.SOLID,
                new CornerRadii(0),
                new BorderWidths(1))));
        btSignUp.setBackground(new Background(new BackgroundFill(Color.ALICEBLUE,CornerRadii.EMPTY,
                Insets.EMPTY)));
        //add TextField and PasswordField for Email and Password
        gridPane.add(tfEmail = new TextField(),1,0);
        gridPane.add(pfPassword = new PasswordField(),1,1);
        //add Email and Password Label
        gridPane.add(lbEmail = new Label("Email:"),0,0);
        gridPane.add(lbPassword = new Label("Password:"),0,1);
        //Column Split of 25,50,25
        ColumnConstraints col1 = new ColumnConstraints();
        col1.setPercentWidth(25);
        ColumnConstraints col2 = new ColumnConstraints();
        col2.setPercentWidth(50);
        ColumnConstraints col3 = new ColumnConstraints();
        col3.setPercentWidth(25);
        gridPane.getColumnConstraints().addAll(col1,col2,col3);

        sceneLayout.setTop(gridPane);
        sceneLayout.setBottom(new ImageView(image));

        primaryStage.setTitle("FACEBOOK"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage

        }

    }