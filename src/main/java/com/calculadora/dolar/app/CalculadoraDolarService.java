package com.calculadora.dolar.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CalculadoraDolarService {
    @Value("${api.url}")
    private String apiUrl;

    private final RestTemplate restTemplate;

    @Autowired
    public CalculadoraDolarService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Cotizacion obtenerCotizacion() {
        try {
            return restTemplate.getForObject(apiUrl, Cotizacion.class);
        } catch (Exception e) {
            throw new RuntimeException("Error al obtener la cotización del dólar: " + e.getMessage(), e);
        }
    }
}
