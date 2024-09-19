
//Clase Impresora.

package Proyecto_3;

public class Impresora {
    //Variables.
    private int id;
    private String marca;
    private String tipoImpresora;
    private float peso;

    //Constructor.
    public Impresora(int id, String marca, String tipoImpresora, float peso) {
        this.id = id;
        this.marca = marca;
        this.tipoImpresora = tipoImpresora;
        this.peso = peso;
    }

    //Getters and Setters.
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoImpresora() {
        return tipoImpresora;
    }

    public void setTipoImpresora(String tipoImpresora) {
        this.tipoImpresora = tipoImpresora;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
