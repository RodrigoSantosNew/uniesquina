package br.edu.ifms.com.uniesquina.uniesquina.dao;

import br.edu.ifms.com.uniesquina.uniesquina.model.Usuario;
import br.edu.ifms.com.uniesquina.uniesquina.util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author rodri
 */
public class UsuarioDAO {

    public void cadastrar(Usuario usuario) {

        String sql =
                "INSERT INTO usuarios (nome, email, senha) VALUES (?, ?, ?)";

        try {

            Conexao conexaoBanco = new Conexao();

            Connection conexao = conexaoBanco.conectar();

            PreparedStatement statement =
                    conexao.prepareStatement(sql);

            statement.setString(1, usuario.getNome());
            statement.setString(2, usuario.getEmail());
            statement.setString(3, usuario.getSenha());

            statement.execute();

            System.out.println("Usuário cadastrado!");

        } catch (Exception e) {

            System.out.println("Erro ao cadastrar!");

        }

    }

}