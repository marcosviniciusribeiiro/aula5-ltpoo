public class Main {
    public static void main(String[] args){
     //Para executar a class Veiculo dentro do Main:
        Veiculo[] garagem = new Veiculo[3];
        garagem[0] = new Veiculo("Gol", 2011);
        garagem[1] = new Veiculo("Civic", 2018);
        garagem[2] = new Veiculo("Corsa", 2004);
        for(Veiculo veiculo:garagem){
            System.out.println(veiculo);
        }
    }
}
/*   Para executar a class Aluno dentro do Main:
        Aluno[] turma = new Aluno[3];

        turma[0] = new Aluno("Maria", 20);
        turma[1] = new Aluno("João", 22);
        turma[2] = new Aluno("Pedro", 21);

        for(Aluno aluno:turma){
            System.out.println(aluno);
        }
*/
