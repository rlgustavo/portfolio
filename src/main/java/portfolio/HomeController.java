
package com.portfolio.portfolio;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {

        // Informações do aluno
        String nome = "Gustavo Lima";
        String profissao = "Desenvolvedor Java";
        String descricao = "Estou aprendendo Spring Boot!";

        // Envia as informações para o HTML
        model.addAttribute("nome", nome);
        model.addAttribute("profissao", profissao);
        model.addAttribute("descricao", descricao);

        // Abre a página inicial
        return "index";
    }
}
