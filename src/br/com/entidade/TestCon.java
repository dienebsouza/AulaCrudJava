/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.entidade;

import java.sql.SQLException;

public class TestCon {
    public static void main(String[] args) throws SQLException {
        //throws é tratamento de exceção antes de criar o objeto
        DAO cx = new DAO();
        //não foi preciso importar porque está no mesmo pacote.
        cx.abrirBanco();
        
    }     
}
