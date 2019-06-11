/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import objectos.Vehiculo;

/**
 *
 * @author Hugo Chanampe
 */
public class GrillaVehiculo extends AbstractTableModel{
    
    private ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    public GrillaVehiculo(ArrayList<Vehiculo> a) {
        vehiculos = a;
        
    }
    
    @Override
    public int getRowCount() {
        return vehiculos.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
	Vehiculo v = vehiculos.get(rowIndex);
	switch(columnIndex){
        case 0: return v.getModelo();
        case 1: return v.getTipo();
        case 2: return v.getMotor();
        case 3: return v.getMatricula();
        case 4: return v.isAutomatico();
        default: return "";
        
    }
    }
@Override
public String getColumnName(int column) {
	switch(column){
         case 0: return "Modelo";
         case 1: return "Tipo";
         case 2: return "Motor";
         case 3: return "Matricula";
         case 4: return "Automatico";
         default: return "";
     
     
     }
    }

public void setDatos(ArrayList<Vehiculo> datos){

    this.vehiculos=datos;
}
}
