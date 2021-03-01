package aulas.oo.exercicio;

public class Program {
    public static void main(String[] args){
        Carro carro = new Carro("Fiat", "Palio", 1991);
        //Carro carro = new Carro();
        System.out.println(carro.getMarca());
        System.out.println(carro.getModelo());
        System.out.println(carro.getAno());
    }
}
