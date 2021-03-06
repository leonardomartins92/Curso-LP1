package classes;

import java.util.ArrayList;
import java.util.Calendar;

public class Aluno extends Usuario {

   private String matricula;
   private ArrayList<Disciplina> historicoDisciplina;
   private double ira;
   private static int id=1;
   private static int ano;
   private static int mudouAno; //valor que salva ano da ultima matricula realizada para verificação

    public Aluno(String nome, String telefone, String email, String sexo) {
        super(nome,telefone,email,sexo);
        // Linha abaixo foi removida apenas para testes de mudança de ano de forma manual
        ano=Calendar.getInstance().get(Calendar.YEAR);
        this.historicoDisciplina=new ArrayList<>();
        if (ano != mudouAno){
            id=1;
        }
        this.matricula=ano+"-"+id;
        id++;
        mudouAno=ano;
    }

    public String descreve(){
        return ("Aluno: "+super.descreve()+this.matricula );
    }

    public double calculaIra(){
       ira=0;
        for (Disciplina disc:historicoDisciplina) {
            ira+=disc.mediaAvaliações();
        }
        ira /=historicoDisciplina.size();
        return ira;
    }

    public String consultaDisciplina(Disciplina disciplina) {
        if (getHistoricoDisciplina().contains(disciplina)) {
            return "A matéria " + disciplina.getDescrição() + " existe no histórico";
        } else {
            return "A matéria " + disciplina.getDescrição() + " não existe no histórico";
        }

    }

    public boolean adicionaDisciplina(Disciplina disciplina){
        getHistoricoDisciplina().add(disciplina);
        return true;
    }

    public boolean removeDisciplina(Disciplina disciplina){
        historicoDisciplina.remove(disciplina);
        return true;
    }

    public String listaDisciplinas(){
       ArrayList disc = new ArrayList();
       for (Disciplina d: historicoDisciplina){
           disc.add(d.getDescrição());
       }
       return "Disciplinas:"+disc;
    }

    //usado apenas para teste da mudança de ano de forma manual
    public static void setAno(int ano) {
        Aluno.ano = ano;
    }

    public ArrayList<Disciplina> getHistoricoDisciplina() {
        return historicoDisciplina;
    }

    public String tratamento(){
        String tratamento = super.tratamento();
        return "Prezad"+tratamento+" Alun"+tratamento;
    }

}
