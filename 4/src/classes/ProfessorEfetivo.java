package classes;

public class ProfessorEfetivo extends Usuario {
    Regime regime;
    private String dataContrataçao;

    public ProfessorEfetivo(String nome, String telefone, String email,String sexo,String departamento, Regime regime, String dataContrataçao) {
        super(nome,telefone,email,sexo,departamento);
        this.dataContrataçao = dataContrataçao;
        this.regime=regime;
    }

    public String descreve(){
        return ("Professor: "+super.descreve()+
                " - "+regime.getDescrição()+
                "\nSalário:"+regime.getSalario()+
                "\nContratado em:"+this.dataContrataçao+"\n");
    }

    public String tratamento(){
        String tratamento = super.tratamento();
        return "Prof. Efetiv"+tratamento;
    }

    public double calculoSalario(){
        return regime.getSalario();
    }

}
