package br.com.devmedia.calculadoraPintura.controller;

import br.com.devmedia.calculadoraPintura.model.CalculadoraDeLitragemDeTinta;
import br.com.devmedia.calculadoraPintura.model.Comodo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculadoraDePinturaController {

    @GetMapping("/")
    public String home(Comodo comodo){
        return "home";
    }

    @PostMapping("/calcular")
    public ModelAndView calcular(@ModelAttribute("comodo") Comodo comodo){
        ModelAndView modelAndView = new ModelAndView("exibirLitros");

        CalculadoraDeLitragemDeTinta calculadoraDeLitragemDeTinta = new CalculadoraDeLitragemDeTinta();

        modelAndView.addObject("total", calculadoraDeLitragemDeTinta.calcularLitragem(comodo));

        return modelAndView;
    }



}
