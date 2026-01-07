public class Condicional {
    public static void main(String[] args) {
        
        int ano = 2022;
        boolean incluidoNoPlano = true;
        String tipoPlano = "plus";

        if (ano >= 2022) {
            System.out.println("Lançamentos que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if (incluidoNoPlano || tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }
    }
}
