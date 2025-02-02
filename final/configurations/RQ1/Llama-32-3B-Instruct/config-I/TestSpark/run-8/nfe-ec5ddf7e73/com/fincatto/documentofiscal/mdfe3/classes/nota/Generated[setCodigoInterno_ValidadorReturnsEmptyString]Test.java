package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class Generated[setCodigoInterno_ValidadorReturnsEmptyString]

Test {

    @Test
    public void [setCodigoInterno_ValidadorReturnsEmptyString]Test() {
        MDFInfoModalRodoviarioVeiculoReboleque obj = new MDFInfoModalRodoviarioVeiculoReboleque();
        String codigoInterno = "1234567890";
        obj.setCodigoInterno(codigoInterno);
        assertEquals("", obj.getCodigoInterno());
    }

}