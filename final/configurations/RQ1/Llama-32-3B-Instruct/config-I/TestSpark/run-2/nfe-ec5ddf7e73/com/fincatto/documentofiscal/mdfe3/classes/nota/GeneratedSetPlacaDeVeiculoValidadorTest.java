package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedSetPlacaDeVeiculoValidadorTest {

    @Test
    public void setPlacaDeVeiculoValidadorTest() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String placaInvalida = "12345";
        obj.setPlaca(placaInvalida);
        assertTrue("Placa invalida", DFStringValidador.placaDeVeiculo(placaInvalida, "Placa do reboque") == null);
    }

}