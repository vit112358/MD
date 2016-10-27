/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafo;

import java.util.Random;

/**
 *
 * @author Fellipe
 */

public class Aresta {
    
    private int id;
    private int origem;
    private int destino;

    //retorna o ID da aresta
    public int getId() {
        return id;
    }

    //seta o ID da aresta
    public void setId(int id) {
        this.id = id;
    }

    //retorna o vertice de origem da aresta
    public int getOrigem() {
        return origem;
    }

    //seta o vertice de origem da aresta
    public void setOrigem(int origem) {
        this.origem = origem;
    }

    //retorna o vertice de destino da aresta
    public int getDestino() {
        return destino;
    }

    //seta o vertice de destino da aresta
    public void setDestino(int destino) {
        this.destino = destino;
    }    
}
