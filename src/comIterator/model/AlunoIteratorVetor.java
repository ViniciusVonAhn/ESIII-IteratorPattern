/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comIterator.model;

/**
 *
 * @author Administrador
 */
public class AlunoIteratorVetor implements Iterator{
    Aluno colecao [] = new Aluno [5];
    int posicao = 0;
    int qtd = 0;
    
    public void add(Aluno novo){
        colecao[qtd] = novo;
        qtd++;
    }
     
    @Override
    public boolean hasNext() {
        if (posicao >= colecao.length || colecao[posicao] == null) {
            posicao = 0;
            return false;
        } else {
            return true;
        }
    }
    
    @Override
    public Object next() {
        Aluno aluno = colecao[posicao];
        posicao++;
        return aluno;
    }
}
