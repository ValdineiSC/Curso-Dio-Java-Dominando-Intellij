package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroProgramaJava {
    public static void main(String[] args) {
        /*int a = 5;
        int b = 10;
        System.out.println("Hello World!" + (a+b));*/
        Gato gato = new Gato();
        System.out.println(gato);
        livro Livro = new livro("O problema dos 3 corpos", 300);
        System.out.println(Livro);


    }
}
class livro {
    private String nome;
    private Integer numPaginas;

    public livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}