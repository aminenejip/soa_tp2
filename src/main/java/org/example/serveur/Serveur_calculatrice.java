package org.example.serveur;

import jakarta.xml.ws.Endpoint;
import org.example.service.Calculatrice;


public class Serveur_calculatrice {

    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

        public static void main(String[] args) {
            String url="http://localhost:8080/ws/calcultrice";
            Endpoint.publish(url,new Calculatrice());
            System.out.println("votre calculatrice publie "+url);


        }}

