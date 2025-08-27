package exercicio2;

public class ProgramaDasFiguras {
    public static void main(String[] args) {
        GerenteDeFiguras gerente = new GerenteDeFiguras();

        Triangulo t1 = new Triangulo(2.0, 3.0);
        gerente.adicionaFigura(t1);

        // Adicionando dois losangos
        Losango l1 = new Losango(4.0, 5.0);
        Losango l2 = new Losango(6.0, 8.0);
        gerente.adicionaFigura(l1);
        gerente.adicionaFigura(l2);

        // Imprimir todas as figuras cadastradas
        System.out.println("Figuras cadastradas:");
        gerente.imprimeFiguras();

        // Mostrar a figura de maior área
        FiguraGeometrica maior = gerente.getMaiorAreaDeFigura();
        if (maior != null) {
            System.out.println("\nFigura com maior área: " + maior.getNomeFigura() +
                               " (área = " + maior.calculaArea() + ")");
        }

        // Calcular e imprimir área total
        System.out.println("\nÁrea total das figuras: " + gerente.calculaAreaTotal());
    }
}
