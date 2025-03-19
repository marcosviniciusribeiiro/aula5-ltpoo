public class Aluno {
    private String nome;
    private int idade;

    public Aluno(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public class ExemploVetorObjetos{
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
        }
    }


    public String toString(){
     return "Nome: " + nome + ", Idade: " + idade;
    }
}
