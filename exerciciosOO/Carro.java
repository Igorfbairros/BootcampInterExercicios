package aulas.oo.exercicio;

public class Carro {
    private String marca;
    private String modelo;
    private Integer ano;
    private String variate;

    public Carro(){


    }

    public Carro(String marca, String modelo, int ano) {
        this.modelo = marca;
        this.marca = modelo;
        this.ano = ano;

    }

    public String getMarca(){
        return marca;

    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public Integer getAno(){
        return ano;
    }
    public void setAno(Integer ano){
        this.ano = ano;
    }



}
