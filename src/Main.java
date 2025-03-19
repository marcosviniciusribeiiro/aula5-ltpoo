public class Main {
    public static void main(String[] args){
        //Criando um vetor de objetos Alunos
        Aluno[] turma = new Aluno[3];

        //Inicializando os objetos do vetor
        turma[0] = new Aluno("Maria", 20);
        turma[1] = new Aluno("João", 22);
        turma[2] = new Aluno("Pedro", 21);

        //Imprimindo os Dados
        for(Aluno aluno:turma){
            System.out.println(aluno);
        }

/*        double[] notas = {7.0, 8.5, 9.0, 6.0, 7.5};
        double soma = 0;
        for(double nota : notas){
            soma+=nota;
        }
        System.out.printf("Média da Turma: %.1f", (soma / notas.length));
*/
    }
}
