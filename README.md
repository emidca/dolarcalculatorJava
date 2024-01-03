# Calculadora Dólar

Esta aplicación en Java Spring Boot ofrece funcionalidades para obtener la cotización del dólar blue y calcular el valor en pesos argentinos.

## Características

- **Obtener Cotización del Dólar Blue:** Consulta la cotización actualizada del dólar blue.
  
- **Calcular Valor en Pesos:** Calcula el equivalente en pesos argentinos para una cantidad especificada de dólares.

## Endpoints

### Obtener Cotización del Dólar Blue

```http
GET /calculadora/cotizacion

Devuelve la cotización actual del dólar blue.
Calcular Valor en Pesos

http

GET /calculadora/calcular?dolares={cantidad}

Calcula el valor equivalente en pesos argentinos para la cantidad especificada de dólares.
Configuración


Dependencias

    Spring Boot Web: Framework para desarrollar aplicaciones web.
    Jackson Databind: Biblioteca para trabajar con JSON en Java.
    Spring Boot DevTools: Herramientas de desarrollo para mejorar la experiencia de desarrollo.
    Spring Boot Starter Test: Dependencias para realizar pruebas unitarias.
    Spring Web: Módulo de Spring para desarrollo web.
