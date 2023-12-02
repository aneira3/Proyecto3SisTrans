package uniandes.edu.co.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uniandes.edu.co.demo.repository.habitacionesRepository;

@Controller
public class Req1Controller {
    @Autowired
    private habitacionesRepository consumoProductoRepository;

   @RequestMapping("/requerimiento1")
    public String requerimiento1(Model model) {
        //model.addAttribute("INFO", consumoProductoRepository.buscar());
        return "requerimiento1"; 
    }
    
}
