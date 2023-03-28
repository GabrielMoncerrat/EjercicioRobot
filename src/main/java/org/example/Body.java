package org.example;

public class Cuerpo {
    private String caminar;
    private String saltar;

    public Cuerpo(String caminar, String saltar) {
        this.caminar = caminar;
        this.saltar = saltar;
    }

    public String getCaminar() {
        return caminar;
    }

    public void setCaminar(String caminar) {
        this.caminar = caminar;
    }

    public String getSaltar() {
        return saltar;
    }

    public void setSaltar(String saltar) {
        this.saltar = saltar;
    }

    @Override
    public String toString() {
        return "Cabeza{" +
                "caminar='" + caminar + '\'' +
                '}';
    }
}
