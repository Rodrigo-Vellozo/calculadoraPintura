package br.com.devmedia.calculadoraPintura.controller;

import br.com.devmedia.calculadoraPintura.model.Calculadora;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculadoraController {

    @GetMapping
    public String index(@ModelAttribute("calculadora") Calculadora calculadora){
        return "index";
    }

    @PostMapping(value = "/calcular")
    public ModelAndView calcular(@ModelAttribute("calculadora")Calculadora calculadora){
        ModelAndView modelAndView = new ModelAndView("listagem");

        final Double rendimento=21.11; //suvinil e coral rendem 21,11m² por litro ... varia de acordo com o tipo da tinta, independente de fabricante

        Double areaParedes = 2*(calculadora.getLargura()+calculadora.getProfundidade())*calculadora.getAltura();
        Double areaTeto = calculadora.getLargura()*calculadora.getProfundidade();
        Double litros = (areaParedes+areaTeto)/rendimento; //(areaParedes+areaTeto)/rendimento por m²

        modelAndView.addObject("areaParedes", areaParedes);
        modelAndView.addObject("areaTeto", areaTeto);
        modelAndView.addObject("areaTotal",areaParedes + areaTeto);
        modelAndView.addObject("litros", litros);

        return modelAndView;
    }



}
