package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedPlacaSetInvalidoTest {

    @Test
    public void placaSetInvalidoTest() {
        String placa = "abcdefgh";
        DFStringValidador.placaDeVeiculo(placa, "Placa do reboque");
        new MDFInfoModalRodoviarioVeiculoReboque().setPlaca(placa);
        assertEquals("ABC123", new MDFInfoModalRodoviarioVeiculoReboque().getPlaca());
    }

}