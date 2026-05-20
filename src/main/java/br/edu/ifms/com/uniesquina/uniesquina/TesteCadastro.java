package br.edu.ifms.com.uniesquina.uniesquina;

import br.edu.ifms.com.uniesquina.uniesquina.dao.UsuarioDAO;
import br.edu.ifms.com.uniesquina.uniesquina.model.Usuario;

/**
 *
 * @author rodri
 */
public class TesteCadastro {

    public static void main(String[] args) {

        Usuario usuario = new Usuario();

        usuario.setNome("Rodrigo");
        usuario.setEmail("rodrigo@gmail.com");
        usuario.setSenha("123456");

        UsuarioDAO dao = new UsuarioDAO();

        dao.cadastrar(usuario);

    }

}