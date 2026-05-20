/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.com.uniesquina.uniesquina.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author rodri
 */
public class Conexao {

    public Connection conectar() {

        Connection conexao = null;

        String url = "jdbc:mysql://localhost:3306/uniesquina";
        String usuario = "root";
        String senha = "";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            conexao = DriverManager.getConnection(
                    url,
                    usuario,
                    senha
            );

            System.out.println("Conectado!");

        } catch (Exception e) {

            System.out.println("Erro na conexão!");

        }

        return conexao;

    }

}