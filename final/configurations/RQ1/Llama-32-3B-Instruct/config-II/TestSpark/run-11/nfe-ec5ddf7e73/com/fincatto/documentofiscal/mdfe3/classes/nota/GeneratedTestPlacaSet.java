package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTestPlacaSet {

    @Test
    public void testPlacaSet() {
        MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
        String placa = "ABC123";
        object.setPlaca(placa);
        assertEquals("ABC123", object.getPlaca());
    }

}