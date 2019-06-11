/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.unlar;

import java.util.ArrayList;
import ui.Principal;
import objectos.Motor;
import static ui.Principal.motores;

/**
 *
 * @author hp
 */
public class Repaso {
public static ArrayList vehiculos = new ArrayList();
public static ArrayList motores = new ArrayList();

        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //LLAMADA A OTRA CLASE 
        ui.Principal principal = new ui.Principal();
        principal.setVisible(true);
     
    }
    
}
