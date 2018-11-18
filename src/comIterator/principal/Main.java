/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comIterator.principal;

import comIterator.model.Aluno;
import comIterator.model.AlunoIteratorArray;
import comIterator.model.AlunoIteratorVetor;

/**
 *
 * @author Administrador
 */
public class Main {
    public static void main(String[] args) {
        //AlunoIteratorArray turma = new AlunoIteratorArray();
        AlunoIteratorVetor turma = new AlunoIteratorVetor();
        
        turma.add(new Aluno("Vinicius", 20));
        turma.add(new Aluno("Jeniffer", 22));
        turma.add(new Aluno("Angelita", 55));
        turma.add(new Aluno("Roni", 80));
        turma.add(new Aluno("Julia", 15));
        
        System.out.println("Nomes");
        Aluno atual;
        while(turma.hasNext()){
            Aluno menuItem = (Aluno)turma.next();
            System.out.println(menuItem.nome);
        }
        System.out.println("******************");
        System.out.println("Menores de idade");
        while(turma.hasNext()){
            atual = (Aluno) turma.next();
            if(atual.idade < 18){
                System.out.println(atual.nome + " " + atual.idade);
            } 
        }
        System.out.println("******************");
        System.out.println("Maiores");
        while(turma.hasNext()){
            atual = (Aluno) turma.next();
            if(atual.idade > 17){
                System.out.println(atual.nome + " " + atual.idade);
            } 
        }
    }
}
