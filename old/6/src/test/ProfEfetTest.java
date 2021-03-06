package test;

import classes.ProfessorEfetivo;
import classes.Regime;
import classes.SexoUsuario;

import java.time.LocalDate;
import java.util.Date;

public class ProfEfetTest {
    public static void main(String[] args) {
       //Criação dos Tipos de regimes
        Regime regime1 = new Regime("Efetivo", 5000);
        Regime regime2 = new Regime("20 aulas", 3000);

        //Criação de professores
        LocalDate data= LocalDate.now();
        ProfessorEfetivo prof1= new ProfessorEfetivo("Pedro","32223123","pedro@hotmail", SexoUsuario.MASCULINO,
                "Informatica",regime1,data);
        ProfessorEfetivo prof2= new ProfessorEfetivo("Marcos","99981237","markin@gmail",SexoUsuario.MASCULINO,
                "Eletrica", regime2,data);
        ProfessorEfetivo prof3= new ProfessorEfetivo("Marcia","99981237","markin@gmail",SexoUsuario.FEMININO,
                "Eletrica", regime2, data);

        //Consulta
        System.out.println(prof1.descreve());
        System.out.println(prof2.descreve());
        System.out.println("\n");

        //Teste do tratamento
        System.out.println(prof3.tratamento());
        System.out.println(prof1.tratamento());
        System.out.println("\n");

        //Metodo salario
        System.out.println("O salario é:"+prof1.calculoSalario());
        System.out.println("O salario é:"+prof2.calculoSalario());
        System.out.println("\n");

    }
}