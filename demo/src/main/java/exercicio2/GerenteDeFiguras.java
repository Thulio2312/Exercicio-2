package exercicio2;

import java.util.ArrayList;
import java.util.List;

public class GerenteDeFiguras {
   final private List<FiguraGeometrica> figuras;

    public GerenteDeFiguras() {
        figuras = new ArrayList<>();
    }

    public void adicionaFigura(FiguraGeometrica figura) {
        figuras.add(figura);
    }

    public void imprimeFiguras() {
        for (FiguraGeometrica f : figuras) {
            System.out.println(f.getNomeFigura());
        }
    }

    public FiguraGeometrica getMaiorAreaDeFigura() {
        if (figuras.isEmpty()) return null;
        FiguraGeometrica maior = figuras.get(0);
        for (FiguraGeometrica f : figuras) {
            if (f.calculaArea() > maior.calculaArea()) {
                maior = f;
            }
        }
        return maior;
    }

    public double calculaAreaTotal() {
        double soma = 0;
        for (FiguraGeometrica f : figuras) {
            soma += f.calculaArea();
        }
        return soma;
    }
}
