/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semIterator.principal;

import java.util.ArrayList;
import semIterator.model.Aluno;

/**
 *
 * @author Administrador
 */
public class Main {
    public static void main(String[] args) {
        
        //Aluno[] turma = new Aluno[5];
        //int qtAlunos = 0;
        ArrayList <Aluno> turma = new <Aluno>ArrayList();
        
        ///////////////////////ADICIONAR VETOR////////////////////////////
        //turma[qtAlunos] = new Aluno("Vinicius", 20); qtAlunos++;
        //turma[qtAlunos] = new Aluno("Jeniffer", 22); qtAlunos++;
        //turma[qtAlunos] = new Aluno("Angelita", 55); qtAlunos++;
        //turma[qtAlunos] = new Aluno("Roni", 80); qtAlunos++;
        //turma[qtAlunos] = new Aluno("Julia", 15); qtAlunos++;
        ///////////////////////ADICIONAR VETOR////////////////////////////
        
        ///////////////////////ADICIONAR ARRAYLIST/////////////////////////////////////////
        turma.add(new Aluno("Vinicius", 20));
        turma.add(new Aluno("Jeniffer", 22));
        turma.add(new Aluno("Angelita", 55));
        turma.add(new Aluno("Roni", 80));
        turma.add(new Aluno("Julia", 15));
        ///////////////////////ADICIONAR ARRAYLIST/////////////////////////////////////////
        
        /**********************MOSTRA VETOR*********************************************/
        //System.out.println("Nomes");
        //for (int i = 0; i < qtAlunos; i++) {
        //    System.out.println(turma[i].getNome() + " " + turma[i].getIdade());
        //}
        //System.out.println("*****************");
        //System.out.println("Menores de idade");
        //for (int i = 0; i < qtAlunos; i++) {
        //    if(turma[i].getIdade() < 18) {
        //    System.out.println(turma[i].getNome() + " " + turma[i].getIdade());
        //    }
        //}
        //System.out.println("*****************");
        //System.out.println("Maiores de idade");
        //for (int i = 0; i < qtAlunos; i++) {
        //    if(turma[i].getIdade() > 17) {
        //    System.out.println(turma[i].getNome() + " " + turma[i].getIdade());
        //    }
        //}
        /**********************MOSTRA VETOR*********************************************/
        
        /**********************MOSTRA ARRAYLIST*****************************************/
        System.out.println("Nomes");
        for(int i = 0; i <turma.size(); i++){
            System.out.println(turma.get(i).getNome());
        }
        System.out.println("*****************");
        System.out.println("Menores de idade");
        for (int i = 0; i < turma.size(); i++) {
            if(turma.get(i).getIdade() < 18) {
            System.out.println(turma.get(i).getNome() + " " + turma.get(i).getIdade());
            }
        }
        System.out.println("*****************");
        System.out.println("Maiores de idade");
        for (int i = 0; i < turma.size(); i++) {
            if(turma.get(i).getIdade() > 17) {
            System.out.println(turma.get(i).getNome() + " " + turma.get(i).getIdade());
            }
        }
        /**********************MOSTRA ARRAYLIST*****************************************/
    }
}
