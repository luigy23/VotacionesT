/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Textos;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;



//esta clase contiene metodos que limitan los caracteres


public class Textos {
    
    
    
    //metodo para solo letras (pide el evnto de teclas)
    public void Sletras(KeyEvent evt) {
   
    
    char c = evt.getKeyChar(); //guarda caracter en "c"
    if (Character.isDigit(c)){ //si el carracter es un numero
        
    evt.consume();  //eliminarlo
    }}
    
     //metodo para solo numeros (pide el evnto de teclas)
    public void Snumeros(KeyEvent evt) {
    char c = evt.getKeyChar();  //guarda caracter en "c"
    if (!Character.isDigit(c)){ //si el carracter no es un numero
        
    evt.consume(); //eliminarlo
    }}

    
}
