package br.edu.ifms.com.uniesquina.uniesquina.servlet;

import br.edu.ifms.com.uniesquina.uniesquina.dao.UsuarioDAO;
import br.edu.ifms.com.uniesquina.uniesquina.model.Usuario;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author rodri
 */
@WebServlet("/cadastro")
public class CadastroServlet extends HttpServlet {

    @Override
    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {

        String nome = request.getParameter("nome");

        String email = request.getParameter("email");

        String senha = request.getParameter("senha");

        Usuario usuario = new Usuario();

        usuario.setNome(nome);
        usuario.setEmail(email);
        usuario.setSenha(senha);

        UsuarioDAO dao = new UsuarioDAO();

        dao.cadastrar(usuario);

        response.getWriter().println(
                "Usuário cadastrado com sucesso!"
        );

    }

}