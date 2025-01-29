package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestCapacidadeKG {

    public int codigoInterno(int valor) {
        return valor;
    }

    public String placa(String numero) {
        return "ABC" + numero;
    }

    public String renavam(String nombre) {
        return "Renavam" + nombre;
    }

    public String tara(String marca) {
        return "Tara" + marca;
    }

    public int capacidadeKG(int valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Capacidade KG não pode ser negativa");
        }
        return valor * 100;
    }

    public double capacidadeM3(int valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Capacidade M3 não pode ser negativa");
        }
        return (double) valor / 300.0;
    }
}

@Test
public void testCapacidadeKG() {
    assertEquals(100, Nota.capacidadKG(100));
}

}