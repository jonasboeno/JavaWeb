package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jb005983
 */
public class ProdutoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        
        //Array que recebe nome do produto
        List<String> lista = new ArrayList<>();
        lista.add("Pepsi");
        lista.add("Coca");
        lista.add("Pastel Frito");
        lista.add("Pizza");
        lista.add("Xis");
        lista.add("Cerveja");
        
        //Array que recebe preço do produto
        List<String> preco = new ArrayList<>();
        preco.add("R$4,00");
        preco.add("R$5,00");
        preco.add("R$3,00");
        preco.add("R$14,00");
        preco.add("R$10,00");
        preco.add("R$3,50");
        
        PrintWriter saida = resp.getWriter();
        
        //Recebe o parâmetro
        String pesquisa = req.getParameter("pesquisa");
        String precos = req.getParameter("precos");
        
        //Se o parâmetro não foi enviado, inicializa a variavel de pesquisa
        if (pesquisa == null) pesquisa = "";
        
        for (String prod : lista){
            if(prod.contains(pesquisa) || "sim".contains(precos)) saida.write(prod + " - " + preco + "<br>");
        }
        
        //Apresenta produtos listados em Array - Jonas
        //for (int i = 0; i < produtos.size(); i++){
            //saida.write(""+ produtos.get(i));
        
        //Apresenta produtos listados em Array - Tiago
        //for (String prod : lista)
            //saida.write(prod + "<br>");
       }
          
}
