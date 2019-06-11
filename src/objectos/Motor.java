/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectos;

/**
 *
 * @author hp
 */
public class Motor {
    private String codigo;
    private Integer cilindro;
    private Float potencia;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Integer getCilindro() {
        return cilindro;
    }

    public void setCilindro(Integer cilindro) {
        this.cilindro = cilindro;
    }

    public Float getPotencia() {
        return potencia;
    }

    public void setPotencia(Float potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Motor{" + "codigo=" + codigo + ", cilindro=" + cilindro + ", potencia=" + potencia + '}';
    }

    public void setCilindros(int i) {
         //To change body of generated methods, choose Tools | Templates.
         this.cilindro = i;
    }
    
    
}
