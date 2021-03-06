package classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Relatorio {

    public static ArrayList crescente(Aluno aluno) {
        ArrayList<Disciplina> listaDisciplinas = aluno.listaDisciplinas.listar();
        ArrayList<Avaliacao> listaAvaliacao = new ArrayList<>();

        for (Disciplina d : listaDisciplinas) {
            ArrayList<Avaliacao> lista = d.listaAvaliacoes.listar();
            for (Avaliacao av : lista) {
                listaAvaliacao.add(av);
            }
        }

        Collections.sort(listaAvaliacao, Relatorio.comparaValor);
        return listaAvaliacao;
    }

    public static ArrayList decrescente(Aluno aluno) {
        ArrayList<Avaliacao> listaOrdenada;
        listaOrdenada=Relatorio.crescente(aluno);
        Collections.reverse(listaOrdenada);
        return listaOrdenada;
    }

    public static ArrayList alfabetico(Aluno aluno){
        ArrayList<Disciplina> listaDisciplinas = aluno.listaDisciplinas.listar();
        Collections.sort(listaDisciplinas, Relatorio.comparaAlfabetico);
        return listaDisciplinas;
    }

    public static Comparator<Avaliacao> comparaValor = (v1, v2) -> {
       int valor1 = v1.getValor();
       int valor2 = v2.getValor();

       return valor1-valor2;
    };

    public static Comparator<Disciplina> comparaAlfabetico = (disciplina1, disciplina2) -> {
        String nomeDisciplina1 = disciplina1.getDescricao();
        String nomeDisciplina2 = disciplina2.getDescricao();

        return nomeDisciplina1.compareTo(nomeDisciplina2);


    };
}







