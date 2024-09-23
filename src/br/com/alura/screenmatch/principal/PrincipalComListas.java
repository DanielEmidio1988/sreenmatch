package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args){
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        Filme deadpoolEWolverine = new Filme("DeadPool e Wolverine", 2024);
        deadpoolEWolverine.avalia(10);
        Serie lost = new Serie("Lost", 2000);
        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(deadpoolEWolverine);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        lista.forEach(list -> System.out.println(list));
        System.out.println("----");
        lista.forEach(System.out::println);
        System.out.println("----");
        //o símbolo :: é a sintaxe do Method Reference, que no exemplo mostrado faz uma referência para o método println
        for(Titulo item: lista){
            System.out.println(item.getNome());
            if(item instanceof Filme filme && filme.getClassificacao() > 2){ //este trecho normalmente é encontrado em códigos legados. Aqui eu pergunto se o item pertence a classe Filme. Da mesma forma, já declaro a variavel 'filme' como uma variavel da classe de 'Filme'
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        List<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jaqueline");
        System.out.println(buscaPorArtista);
        Collections.sort(buscaPorArtista); //ordena por ordem alfabética
        System.out.println(buscaPorArtista);
        System.out.println("Lista de titulo ordenado por nome");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);


    }
}
