/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Personal
 */
public class Nodo {

    public Object element;
    public Nodo siguiente, ant;

    public Nodo(Object element) {
        this.element = element;
    }
}
