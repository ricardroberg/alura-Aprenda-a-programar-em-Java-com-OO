package br.com.alura.tdd;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class CalculadoraTest {


@Test
    public void deveriaSomarDoisNumerosPositivos(){
        Calculadora calc = new Calculadora();
        int soma = calc.somar(3, 7);

    Assertions.assertEquals(10 , soma);
    }
}
