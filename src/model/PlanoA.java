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
public class PlanoA extends Paciente {
    public String numeroPA;
    
    public PlanoA(){
        
    }

    @Override
    public void imprimir() {
        String texto = "Nome" + this.nome + "\nTelefone" + this.telefone +
                "\nNumero do Plano" + this.numeroPA;
        JOptionPane.showMessageDialog(null, texto);
   
        
    }
    
    
   
}
