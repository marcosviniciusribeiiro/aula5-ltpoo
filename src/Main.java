public class Main {
    public static void main(String[] args){
        double[] notas = {7.0, 8.5, 9.0, 6.0, 7.5};
        double soma = 0;
        for(double nota : notas){
            soma+=nota;
        }
        System.out.printf("Média da Turma: %.1f", (soma / notas.length));
    }
}
