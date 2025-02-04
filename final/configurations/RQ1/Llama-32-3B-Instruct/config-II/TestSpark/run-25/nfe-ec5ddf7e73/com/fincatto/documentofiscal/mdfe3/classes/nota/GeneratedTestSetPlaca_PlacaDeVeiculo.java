package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.simpleframework.xml.Element;

public class GeneratedTestSetPlaca_PlacaDeVeiculo {

    @Test
    public void testSetPlaca_PlacaDeVeiculo() {
        String placa = "ABC123";
        new MDFInfoModalRodoviarioVeiculoReboque().setPlaca(placa);
        assertEquals("ABC123", new MDFInfoModalRodoviarioVeiculoReboque().getPlaca());
    }

}