package com.example.ex1_chap2;

import javafx.scene.paint.Color;

public class Jouet {
    private String nom;
    private String matiere;
    private double prix;
    private int publique;
    private Object txtReduction;
    public String couleur;
    public Color couleur2;

    public Jouet (String unNom ,String uneMatiere, double unPrix, int unPublic){
            this.nom = unNom;
            this.matiere = uneMatiere;
            this.prix = unPrix;
            this.publique = unPublic;


    }



    public String getNom() {
        return nom;

    }

    public void setNom(String nom) {
        this.nom = nom;

    }


    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {



        this.prix = prix;
    }


    public int getPublique() {
        return publique;
    }

    public void setPublic(int Public) {
        this.publique = publique;
    }
    public String getCouleur(){

        if (this.publique == 1){
            couleur = "Bleu";


        }
        if (this.publique == 2){
            couleur = "Vert";


        }
        if (this.publique == 3){
            couleur = "Rouge";


        }
        if (this.publique == 4){
            couleur = "Noir";

        }

        return couleur;
    }
    public void setCouleur(String couleur){
        this.couleur = couleur;


    }



    }

