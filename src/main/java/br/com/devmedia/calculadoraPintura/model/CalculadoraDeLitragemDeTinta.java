package br.com.devmedia.calculadoraPintura.model;

public class CalculadoraDeLitragemDeTinta {

    private Double areaParedes;
    private Double areaTeto;
    private final Double rendimento =21.11;

    public Double calcularLitragem(Comodo comodo){
        areaParedes = 2 *(comodo.getLargura()+comodo.getProfundidade())*comodo.getAltura();
        areaTeto = comodo.getLargura() * comodo.getProfundidade();
        return (areaParedes+areaTeto)/rendimento;
    }

}
