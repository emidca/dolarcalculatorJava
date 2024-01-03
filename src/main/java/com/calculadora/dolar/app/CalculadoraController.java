package com.calculadora.dolar.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {
    private final CalculadoraDolarService calculadoraDolarService;

    public CalculadoraController(CalculadoraDolarService calculadoraDolarService) {
        this.calculadoraDolarService = calculadoraDolarService;
    }

    @GetMapping("/cotizacion")
    public Cotizacion obtenerCotizacion() {
        return calculadoraDolarService.obtenerCotizacion();
    }

    @GetMapping("/calcular")
    public String calcularValorEnPesos(@RequestParam("dolares") double dolares) {
        Cotizacion cotizacion = calculadoraDolarService.obtenerCotizacion();
        double valorEnPesos = dolares * cotizacion.getVenta();
        return "El valor de " + dolares + " dólares es de " + valorEnPesos + " pesos argentinos.";
    }
}