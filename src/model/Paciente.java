/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.swing.JOptionPane;

/**
 *
 * @author claudio.silva
 */
public class Paciente {
    public int id;
    public String nome, telefone;
    protected String endereco;
    private String email;
    
    public Paciente( ){
 
    }
    
    public void imprimir(){
        String texto = "Nome" + this.nome + "\nTelefone" + this.telefone;
        JOptionPane.showMessageDialog(null, texto);
    }
    private void imprimirEmail(){
        String texto = "Email" + this.email;
        JOptionPane.showMessageDialog(null, texto);
    }
}
