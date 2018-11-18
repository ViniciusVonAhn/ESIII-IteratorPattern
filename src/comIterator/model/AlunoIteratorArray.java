/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comIterator.model;

import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class AlunoIteratorArray implements Iterator{
    ArrayList<Aluno> colecao = new <Aluno> ArrayList();
    int posicao = 0;
    int qtd = 0;
    
    public void add(Aluno novo){
        colecao.add(novo);
        qtd++;
    }
     
    @Override
    public boolean hasNext() {
        if (posicao >= colecao.size() || colecao.get(posicao) == null) {
            posicao = 0;
            return false;
        } else {
            return true;
        }
    }
    
    @Override
    public Object next() {
        Aluno aluno = colecao.get(posicao);
        posicao++;
        return aluno;
    }
}
