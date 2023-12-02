package uniandes.edu.co.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Requerimiento2Controller {


    @GetMapping("/requerimiento2")
    public String requerimiento1(Model model) {
        //model.addAttribute("INFO", consumoProductoRepository.buscar());
        return "requerimiento2"; 
    }
    
}
