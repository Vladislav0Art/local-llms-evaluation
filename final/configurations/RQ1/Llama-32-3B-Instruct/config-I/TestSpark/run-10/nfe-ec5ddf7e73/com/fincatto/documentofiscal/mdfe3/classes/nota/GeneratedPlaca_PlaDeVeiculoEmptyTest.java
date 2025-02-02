package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Random;

public class GeneratedPlaca_PlaDeVeiculoEmptyTest {

    @Test
    public void placa_PlaDeVeiculoEmptyTest() {
        final String placa = "";
        assert false == DFStringValidador.placaDeVeiculo(placa, "Placa do reboque");
    }

}