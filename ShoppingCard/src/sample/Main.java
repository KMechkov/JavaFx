package sample;

import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import  java.util.LinkedList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;
import javafx.beans.property.IntegerProperty;
import java.math.BigDecimal;
import java.math.BigInteger;
import javafx.beans.property.SimpleIntegerProperty;

public class Main extends Application {


    Basket basketTomato = new Basket(0,"0");
    Basket basketCucumber = new Basket(0,"0");
    Basket basketPotatos = new Basket(0,"0");
    Basket basketOnions = new Basket(0,"0");
    Basket basketTotalValue = new Basket(0,"0");


    @Override
    public void start(Stage primaryStage) throws Exception{


        primaryStage.setTitle("ShoppingCard");
        GridPane grid = new GridPane();
        grid.setHgap(20);
        grid.setVgap(20);
        grid.setPadding(new Insets(10,25,25,25));
        Scene scene = new Scene(grid,650,200);


        HBox hbox = new HBox(1);
        HBox hbox1 = new HBox(1);
        HBox hbox2 = new HBox(1);
        HBox hbox3 = new HBox(1);

        Button buttonTomato = new Button ("Add ");
        Button buttonCucumber = new Button("Add");
        Button buttonPotatos = new Button("Add");
        Button buttonOnions = new Button("Add");


        hbox.getChildren().addAll(buttonTomato);
        hbox1.getChildren().addAll(buttonCucumber);
        hbox2.getChildren().addAll(buttonPotatos);
        hbox3.getChildren().addAll(buttonOnions);

        grid.add(hbox,2,0);
        grid.add(hbox1,2,1);
        grid.add(hbox2,2,2);
        grid.add(hbox3,2,3);

        TextField textFieldTomato = new TextField();
        TextField textFieldCucumber = new TextField();
        TextField textFieldPotato = new TextField();
        TextField textFieldOnion = new TextField();


        grid.add(textFieldTomato,0,0);
        grid.add(textFieldCucumber,0,1);
        grid.add(textFieldPotato,0,2);
        grid.add(textFieldOnion,0,3);

        Label label = new Label("Tomato 1.99lv.");
        Label label1 = new Label("Cucumber 0.99lv.");
        Label label2 = new Label("Potato 1.49lv.");
        Label label3 = new Label("Onion 0.49lv.");
        Label payment = new Label("PROCESS PAYMENT");

        buttonTomato.setMaxWidth(Double.MAX_VALUE);
        buttonCucumber.setMaxWidth(Double.MAX_VALUE);
        buttonPotatos.setMaxWidth(Double.MAX_VALUE);
        buttonOnions.setMaxWidth(Double.MAX_VALUE);


        grid.add(label,1,0);
        grid.add(label1,1,1);
        grid.add(label2,1,2);
        grid.add(label3,1,3);


        Button goToBasket = new Button("Go to basket");
        HBox hbox4 = new HBox(1);
        hbox4.getChildren().addAll(goToBasket);
        grid.add(hbox4,5,3);



        primaryStage.setScene(scene);
        primaryStage.show();

        // Scene Basket
        GridPane gridPane = new GridPane();
        gridPane.setHgap(20);
        gridPane.setVgap(20);

        TextField textFieldRemoveTomato = new TextField();
        TextField textFieldRemoveCucumber = new TextField();
        TextField textFieldRemovePotato = new TextField();
        TextField textFieldRemoveOnion = new TextField();


        Button removeTomato = new Button("Remove");
        Button removeCucumber = new Button("Remove");
        Button removePotato = new Button("Remove");
        Button removeOnion = new Button("Remove");

        gridPane.add(removeTomato,5,0);
        gridPane.add(removeCucumber,5,1);
        gridPane.add(removePotato,5,2);
        gridPane.add(removeOnion,5,3);


        gridPane.add(textFieldRemoveTomato,4,0);
        gridPane.add(textFieldRemoveCucumber,4,1);
        gridPane.add(textFieldRemovePotato,4,2);
        gridPane.add(textFieldRemoveOnion,4,3);
        gridPane.setPadding(new Insets(10,25,25,25));
        Scene scene1 = new Scene(gridPane,650,200);



        goToBasket.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                primaryStage.setScene(scene1);
            }
        });

        Button goBack = new Button("goBack");
        Button checkOut = new Button("CheckOut");

        Label basketTomatoLB = new Label("Tomato");
        Label basketCucumberLB = new Label("Cucumber");
        Label basketPotatoLB = new Label("Potato");
        Label basketOnionLB = new Label("Onion");


        Label basketTomatoCol = new Label("0");
        Label basketCucumberCol = new Label("0");
        Label basketPotatoCol = new Label("0");
        Label basketOnionCol = new Label("0");

        gridPane.add(basketTomatoLB,0,0);
        gridPane.add(basketCucumberLB,0,1);
        gridPane.add(basketPotatoLB,0,2);
        gridPane.add(basketOnionLB,0,3);

        gridPane.add(basketTomatoCol,1,0);
        gridPane.add(basketCucumberCol,1,1);
        gridPane.add(basketPotatoCol,1,2);
        gridPane.add(basketOnionCol,1,3);

        gridPane.add(goBack,8,2);
        gridPane.add(checkOut,8,3);
        gridPane.add(payment,8,0);

        checkOut.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                basketTomato.setColl(0);
                basketTomato.setValue("0");
                basketCucumber.setColl(0);
                basketCucumber.setValue("0");
                basketPotatos.setColl(0);
                basketPotatos.setValue("0");
                basketOnions.setColl(0);
                basketOnions.setValue("0");

                basketTomatoCol.setText(basketTomato.getValue());
                basketCucumberCol.setText(basketCucumber.getValue());
                basketPotatoCol.setText(basketPotatos.getValue());
                basketOnionCol.setText(basketOnions.getValue());
                payment.setText("PAYMENT PROCESS COMPLETE");
            }

        });



        textFieldTomato.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent e){
                textFieldTomato.clear();
            }
        });

        textFieldRemoveTomato.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent e){
                textFieldRemoveTomato.clear();
            }
        });

        removeTomato.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e){
                try {
                    Integer currentTomato = Integer.parseInt(textFieldRemoveTomato.getText());
                    basketTomato.setColl(basketTomato.getColl() - currentTomato);
                    currentTomato = basketTomato.getColl();
                    basketTomato.setValue(currentTomato.toString());

                    if (basketTomato.getColl() < 0){
                        basketTomatoCol.setText("0");
                        textFieldRemoveTomato.clear();
                        textFieldRemoveTomato.setText("Succsess removing");
                    }
                    else {
                        basketTomatoCol.setText(basketTomato.getValue());
                        textFieldRemoveTomato.clear();
                        textFieldRemoveTomato.setText("Succsess removing");
                    }

                }
                catch (Exception e1){
                    textFieldRemoveTomato.clear();
                    textFieldRemoveTomato.setText("Please enter a valid value");
                }
            }
        });

        textFieldRemoveTomato.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                try {
                    Integer currentTomato = Integer.parseInt(textFieldRemoveTomato.getText());
                    basketTomato.setColl(basketTomato.getColl() - currentTomato);
                    currentTomato = basketTomato.getColl();
                    basketTomato.setValue(currentTomato.toString());

                    if (basketTomato.getColl() < 0){
                        basketTomatoCol.setText("0");
                        textFieldRemoveTomato.clear();
                        textFieldRemoveTomato.setText("Succsess removing");
                    }
                    else {
                        basketTomatoCol.setText(basketTomato.getValue());
                        textFieldRemoveTomato.clear();
                        textFieldRemoveTomato.setText("Succsess removing");
                    }

                }
                catch (Exception e1){
                    textFieldRemoveTomato.clear();
                    textFieldRemoveTomato.setText("Please enter a valid value");
                }
            }
        });
        textFieldRemovePotato.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent e){
                textFieldRemovePotato.clear();
            }
        });
        textFieldRemovePotato.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                try {
                    Integer currentPotato = Integer.parseInt(textFieldRemovePotato.getText());
                    basketPotatos.setColl(basketPotatos.getColl() - currentPotato);
                    currentPotato = basketPotatos.getColl();
                    basketPotatos.setValue(currentPotato.toString());

                    if (basketPotatos.getColl() < 0){
                        basketPotatoCol.setText("0");
                        textFieldRemovePotato.clear();
                        textFieldRemovePotato.setText("Succsess removing");
                    }
                    else {
                        basketPotatoCol.setText(basketPotatos.getValue());
                        textFieldRemovePotato.clear();
                        textFieldRemovePotato.setText("Succsess removing");
                    }

                }
                catch (Exception e1){
                    textFieldRemovePotato.clear();
                    textFieldRemovePotato.setText("Please enter a valid value");
                }
            }
        });

        removePotato.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e){
                try {
                    Integer currentPotato = Integer.parseInt(textFieldRemovePotato.getText());
                    basketPotatos.setColl(basketPotatos.getColl() - currentPotato);
                    currentPotato = basketPotatos.getColl();
                    basketPotatos.setValue(currentPotato.toString());

                    if (basketPotatos.getColl() < 0){
                        basketPotatoCol.setText("0");
                        textFieldRemovePotato.clear();
                        textFieldRemovePotato.setText("Succsess removing");
                    }
                    else {
                        basketPotatoCol.setText(basketPotatos.getValue());
                        textFieldRemovePotato.clear();
                        textFieldRemovePotato.setText("Succsess removing");
                    }

                }
                catch (Exception e1){
                    textFieldRemovePotato.clear();
                    textFieldRemovePotato.setText("Please enter a valid value");
                }
            }
        });

        textFieldRemoveCucumber.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent e){
                textFieldRemoveCucumber.clear();
            }
        });

        textFieldRemoveCucumber.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                try {
                    Integer currentCucumber = Integer.parseInt(textFieldRemoveCucumber.getText());
                    basketCucumber.setColl(basketCucumber.getColl() - currentCucumber);
                    currentCucumber = basketCucumber.getColl();
                    basketCucumber.setValue(currentCucumber.toString());

                    if (basketCucumber.getColl() < 0){
                        basketCucumberCol.setText("0");
                        textFieldRemoveCucumber.clear();
                        textFieldRemoveCucumber.setText("Succsess removing");
                    }
                    else {
                        basketCucumberCol.setText(basketCucumber.getValue());
                        textFieldRemoveCucumber.clear();
                        textFieldRemoveCucumber.setText("Succsess removing");
                    }

                }
                catch (Exception e1){
                    textFieldRemoveCucumber.clear();
                    textFieldRemoveCucumber.setText("Please enter a valid value");
                }
            }
        });
        removeCucumber.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e){
                try {
                    Integer currentCucumber = Integer.parseInt(textFieldRemoveCucumber.getText());
                    basketCucumber.setColl(basketCucumber.getColl() - currentCucumber);
                    currentCucumber = basketCucumber.getColl();
                    basketCucumber.setValue(currentCucumber.toString());

                    if (basketCucumber.getColl() < 0){
                        basketCucumberCol.setText("0");
                        textFieldRemoveCucumber.clear();
                        textFieldRemoveCucumber.setText("Succsess removing");
                    }
                    else {
                        basketCucumberCol.setText(basketCucumber.getValue());
                        textFieldRemoveCucumber.clear();
                        textFieldRemoveCucumber.setText("Succsess removing");
                    }

                }
                catch (Exception e1){
                    textFieldRemoveCucumber.clear();
                    textFieldRemoveCucumber.setText("Please enter a valid value");
                }
            }
        });

        textFieldRemoveOnion.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent e){
                textFieldRemoveOnion.clear();
            }
        });
        textFieldRemoveOnion.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                try {
                    Integer currentOnion = Integer.parseInt(textFieldRemoveOnion.getText());
                    basketOnions.setColl(basketOnions.getColl() - currentOnion);
                    currentOnion = basketOnions.getColl();
                    basketOnions.setValue(currentOnion.toString());

                    if (basketOnions.getColl() < 0){
                        basketOnionCol.setText("0");
                        textFieldRemoveOnion.clear();
                        textFieldRemoveOnion.setText("Succsess removing");
                    }
                    else {
                        basketOnionCol.setText(basketOnions.getValue());
                        textFieldRemoveOnion.clear();
                        textFieldRemoveOnion.setText("Succsess removing");
                    }

                }
                catch (Exception e1){
                    textFieldRemoveOnion.clear();
                    textFieldRemoveOnion.setText("Please enter a valid value");
                }
            }
        });

        removeOnion.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e){
                try {
                    Integer currentOnion = Integer.parseInt(textFieldRemoveOnion.getText());
                    basketOnions.setColl(basketOnions.getColl() - currentOnion);
                    currentOnion = basketOnions.getColl();
                    basketOnions.setValue(currentOnion.toString());

                    if (basketOnions.getColl() < 0){
                        basketOnionCol.setText("0");
                        textFieldRemoveOnion.clear();
                        textFieldRemoveOnion.setText("Succsess removing");
                    }
                    else {
                        basketOnionCol.setText(basketOnions.getValue());
                        textFieldRemoveOnion.clear();
                        textFieldRemoveOnion.setText("Succsess removing");
                    }

                }
                catch (Exception e1){
                    textFieldRemoveOnion.clear();
                    textFieldRemoveOnion.setText("Please enter a valid value");
                }
            }
        });

        buttonTomato.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                try {
                    Integer currentTomato = Integer.parseInt(textFieldTomato.getText());
                    currentTomato += basketTomato.getColl();
                    basketTomato.setColl(currentTomato);
                    basketTomato.setValue(currentTomato.toString());

                    basketTomatoCol.setText(basketTomato.getValue());
                    textFieldTomato.clear();
                    textFieldTomato.setText("Succsess adding");
                }

                catch (Exception e1){
                    textFieldTomato.clear();
                    textFieldTomato.setText("Please enter a valid value");
                }
            }
        });

        textFieldTomato.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                try {
                    Integer currentTomato = Integer.parseInt(textFieldTomato.getText());

                    currentTomato += basketTomato.getColl();
                    basketTomato.setColl(currentTomato);
                    basketTomato.setValue(currentTomato.toString());

                    basketTomatoCol.setText(basketTomato.getValue());
                    textFieldTomato.clear();
                    textFieldTomato.setText("Succsess adding");
                }
                catch (Exception e1){
                    textFieldTomato.clear();
                    textFieldTomato.setText("Please enter a valid value");
                }
            }
        });

        textFieldCucumber.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent e){
                textFieldCucumber.clear();
            }
        });
        buttonCucumber.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                try {
                    Integer currentCucumber = Integer.parseInt(textFieldCucumber.getText());

                    currentCucumber += basketCucumber.getColl();
                    basketCucumber.setColl(currentCucumber);
                    basketCucumber.setValue(currentCucumber.toString());

                    basketCucumberCol.setText(basketCucumber.getValue());
                    textFieldCucumber.clear();
                    textFieldCucumber.setText("Succsess adding");
                }
                catch (Exception e1){
                    textFieldCucumber.clear();
                    textFieldCucumber.setText("Please enter a valid value");
                }
            }
        });

        textFieldCucumber.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                try {
                    Integer currentCucumber = Integer.parseInt(textFieldCucumber.getText());

                    currentCucumber += basketCucumber.getColl();
                    basketCucumber.setColl(currentCucumber);
                    basketCucumber.setValue(currentCucumber.toString());

                    basketCucumberCol.setText(basketCucumber.getValue());
                    textFieldCucumber.clear();
                    textFieldCucumber.setText("Succsess adding");
                }
                catch (Exception e1){
                    textFieldCucumber.clear();
                    textFieldCucumber.setText("Please enter a valid value");
                }
            }
        });

        textFieldPotato.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent e){
                textFieldPotato.clear();
            }
        });
        textFieldPotato.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                try {
                    Integer currentPotato = Integer.parseInt(textFieldPotato.getText());

                    currentPotato += basketPotatos.getColl();
                    basketPotatos.setColl(currentPotato);
                    basketPotatos.setValue(currentPotato.toString());

                    basketPotatoCol.setText(basketPotatos.getValue());
                    textFieldPotato.clear();
                    textFieldPotato.setText("Succsess adding");
                }
                catch (Exception e1){
                    textFieldPotato.clear();
                    textFieldPotato.setText("Please enter a valid value");
                }
            }
        });

        buttonPotatos.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                try {
                    Integer currentPotato = Integer.parseInt(textFieldPotato.getText());

                    currentPotato += basketPotatos.getColl();
                    basketPotatos.setColl(currentPotato);
                    basketPotatos.setValue(currentPotato.toString());

                    basketPotatoCol.setText(basketPotatos.getValue());
                    textFieldPotato.clear();
                    textFieldPotato.setText("Succsess adding");
                }
                catch (Exception e1){
                    textFieldPotato.clear();
                    textFieldPotato.setText("Please enter a valid value");
                }
            }
        });
        textFieldOnion.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent e){
                textFieldOnion.clear();
            }
        });

        buttonOnions.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                try {
                    Integer currentOnion = Integer.parseInt(textFieldOnion.getText());

                    currentOnion += basketOnions.getColl();
                    basketOnions.setColl(currentOnion);
                    basketOnions.setValue(currentOnion.toString());

                    basketOnionCol.setText(basketOnions.getValue());
                    textFieldOnion.clear();
                    textFieldOnion.setText("Succsess adding");
                }
                catch (Exception e1){
                    textFieldOnion.clear();
                    textFieldOnion.setText("Please enter a valid value");
                }
            }
        });

        textFieldOnion.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                try {
                    Integer currentOnion = Integer.parseInt(textFieldOnion.getText());

                    currentOnion += basketOnions.getColl();
                    basketOnions.setColl(currentOnion);
                    basketOnions.setValue(currentOnion.toString());

                    basketOnionCol.setText(basketOnions.getValue());
                    textFieldOnion.clear();
                    textFieldOnion.setText("Succsess adding");
                }
                catch (Exception e1){
                    textFieldOnion.clear();
                    textFieldOnion.setText("Please enter a valid value");
                }
            }
        });

        goBack.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                primaryStage.setScene(scene);
                payment.setText("PROCESS PAYMENT");
            }
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}