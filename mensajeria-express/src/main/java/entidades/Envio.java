/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author waw
 */
public class Envio  {
    private float distancia;
    private TIPO_SERVICIO tipoEnvio;
    private float costo;
    private float tiempo;

    public Envio() {
    }

    public Envio(float distancia, TIPO_SERVICIO tipoEnvio, float costo, float tiempo) {
        this.distancia = distancia;
        this.tipoEnvio = tipoEnvio;
        this.costo = costo;
        this.tiempo = tiempo;
    }

    public float getDistancia() {
        return distancia;
    }

    public TIPO_SERVICIO getTipoEnvio() {
        return tipoEnvio;
    }

    public float getCosto() {
        return costo;
    }

    public float getTiempo() {
        return tiempo;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    public void setTipoEnvio(TIPO_SERVICIO tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public void setTiempo(float tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Envio{" + "distancia=" + distancia + ", tipoEnvio=" + tipoEnvio + ", costo=" + costo + ", tiempo=" + tiempo + '}';
    }

}
