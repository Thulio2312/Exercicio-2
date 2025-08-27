package exercicio2;

public class Triangulo implements FiguraGeometrica {
    final private double base;
    final private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calculaArea() {
        return (this.base * this.altura) / 2;
    }

    @Override
    public String getNomeFigura() {
        return "Triângulo";
    }
}
