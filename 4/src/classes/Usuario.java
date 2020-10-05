package classes;

public class Usuario  {
    protected String nome;
    protected String telefone;
    protected String email;
    protected String sexo;
    protected String departamento;

    protected Usuario(String nome, String telefone, String email, String sexo) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.sexo = sexo.toLowerCase();
    }

    protected Usuario(String nome, String telefone, String email, String sexo, String departamento) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.sexo = sexo.toLowerCase();
        this.departamento=departamento;
    }

    protected String descreve (){
        return this.nome+" - Telefone:"+this.telefone+"\n("+this.email+")\n";
    }

    protected String tratamento(){
        if (sexo.equals("feminino")){
            return "a";
        }
        else{
            return "o";
        }
    }


}
