package com.example.ex1_chap2;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

import static java.lang.String.valueOf;

public class HelloController implements Initializable {

    @FXML
    public TextField txtReduction;
    @FXML
    public Label lblPublic;
    @FXML
    public Label lblMatiere;
    @FXML
    public Label lblPrix;
    @FXML
    public Label lblNom;
    public Label lblCouleur;
    Jouet poupeeBarbie;
    Jouet echecLumineux;

    int jouetCourant = 1; // 1 = Jouet1 et 2 = jouet2
    private String couleur2;
    private String Couleurs;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


    }
    public void clickIntervertir1(MouseEvent mouseEvent) {
        poupeeBarbie = new Jouet("Poupee Barbie","Plastique",15,2);
        echecLumineux = new Jouet("Echec Lumineux","Verre",45,4);
        if (jouetCourant == 1){
            poupeeBarbie.setPrix(echecLumineux.getPrix());
            lblPrix.setText(valueOf(poupeeBarbie.getPrix()));
        }
        if (jouetCourant == 2){
            echecLumineux.setPrix(poupeeBarbie.getPrix());
            lblPrix.setText(valueOf(poupeeBarbie.getPrix()));
        }


    }




    @FXML
    public void clickReduction(MouseEvent mouseEvent) {

            Double reduction = Double.parseDouble(txtReduction.getText());
            Double nouveauPrix = (1 - (reduction / 100)) * poupeeBarbie.getPrix();
            lblPrix.setText(valueOf(nouveauPrix));





            Double reduction2 = Double.parseDouble(txtReduction.getText());
            Double nouveauPrix2 = (1 - (reduction2 / 100)) * echecLumineux.getPrix();
            lblPrix.setText(valueOf(nouveauPrix2));



    }

    @FXML
    public void clickJouet1(MouseEvent mouseEvent) {
       poupeeBarbie = new Jouet("Poupee Barbie","Plastique",15,2);
        lblNom.setText(poupeeBarbie.getNom());
        lblMatiere.setText(poupeeBarbie.getMatiere());
        lblPrix.setText(Double.toString(poupeeBarbie.getPrix()));
        lblPublic.setText(Integer.toString(poupeeBarbie.getPublique()));
        lblCouleur.setText(poupeeBarbie.getCouleur());
        jouetCourant = 1;


    }

    @FXML
    public void clickJouet2(MouseEvent mouseEvent) {
        echecLumineux = new Jouet("Echec Lumineux","Verre",45,4);
        lblNom.setText(echecLumineux.getNom());
        lblMatiere.setText(echecLumineux.getMatiere());
        lblPrix.setText(Double.toString(echecLumineux.getPrix()));
        lblPublic.setText(Integer.toString(echecLumineux.getPublique()));
        lblCouleur.setText(poupeeBarbie.getCouleur());

        jouetCourant = 2;

    }

    public void cllickAugmentation(MouseEvent mouseEvent) {
        Double augmentation = Double.parseDouble(txtReduction.getText());
        Double nouveauPrix = (1 + (augmentation / 100)) * poupeeBarbie.getPrix();
        lblPrix.setText(valueOf(nouveauPrix));
        Double augmentation2 = Double.parseDouble(txtReduction.getText());
        Double nouveauPrix2 = (1 + (augmentation2 / 100)) * echecLumineux.getPrix();
        lblPrix.setText(valueOf(nouveauPrix2));
    }


}