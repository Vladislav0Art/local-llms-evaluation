package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTestCodigoInternoSet {

    @Test
    public void testCodigoInternoSet() {
        MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
        String codigoInterno = "1234567890";
        object.setCodigoInterno(codigoInterno);
        assertEquals("1234567890", object.getCodigoInterno());
    }

}