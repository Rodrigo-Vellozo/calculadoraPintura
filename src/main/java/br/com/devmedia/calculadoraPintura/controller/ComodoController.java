package br.com.devmedia.calculadoraPintura.controller;

import br.com.devmedia.calculadoraPintura.model.CalculadoraDeLitragemDeTinta;
import br.com.devmedia.calculadoraPintura.model.Comodo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ComodoController {

    @GetMapping("/")
    public String index(@ModelAttribute("comodo") Comodo calculadora){
        return "index";
    }

    @PostMapping("/calcular")
    public ModelAndView calcular(@ModelAttribute("comodo") Comodo comodo){
        ModelAndView modelAndView = new ModelAndView("quantidadeLitros");

        CalculadoraDeLitragemDeTinta calculadoraDeLitragemDeTinta = new CalculadoraDeLitragemDeTinta();

        modelAndView.addObject("litros", calculadoraDeLitragemDeTinta.calcularLitragem(comodo));

        return modelAndView;
    }



}
