public class ComplexNumber {
    private double real;
    private double imag;

    // Construtor
    public ComplexNumber(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // Getters para a parte real e imaginária
    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    // Método para adicionar dois números complexos
    public ComplexNumber add(ComplexNumber other) {
        double realPart = this.real + other.getReal();
        double imagPart = this.imag + other.getImag();
        return new ComplexNumber(realPart, imagPart);
    }

    // Método para subtrair dois números complexos
    public ComplexNumber subtract(ComplexNumber other) {
        double realPart = this.real - other.getReal();
        double imagPart = this.imag - other.getImag();
        return new ComplexNumber(realPart, imagPart);
    }

    // Método para multiplicar dois números complexos
    public ComplexNumber multiply(ComplexNumber other) {
        double realPart = this.real * other.getReal() - this.imag * other.getImag();
        double imagPart = this.real * other.getImag() + this.imag * other.getReal();
        return new ComplexNumber(realPart, imagPart);
    }

    // Método para dividir dois números complexos
    public ComplexNumber divide(ComplexNumber other) {
        double denominator = other.getReal() * other.getReal() + other.getImag() * other.getImag();
        double realPart = (this.real * other.getReal() + this.imag * other.getImag()) / denominator;
        double imagPart = (this.imag * other.getReal() - this.real * other.getImag()) / denominator;
        return new ComplexNumber(realPart, imagPart);
    }

    // Sobrescreve o método equals para comparação correta de números complexos
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ComplexNumber that = (ComplexNumber) obj;
        return Double.compare(that.real, real) == 0 &&
                Double.compare(that.imag, imag) == 0;
    }

    // Sobrescreve o método toString para uma representação amigável de um número complexo
    @Override
    public String toString() {
        return real + " + " + imag + "i";
    }
}
