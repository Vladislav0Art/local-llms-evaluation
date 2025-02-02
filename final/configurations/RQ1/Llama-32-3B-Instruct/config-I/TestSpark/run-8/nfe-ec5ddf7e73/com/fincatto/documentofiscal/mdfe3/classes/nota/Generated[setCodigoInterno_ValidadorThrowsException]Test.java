package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class Generated[setCodigoInterno_ValidadorThrowsException]

Test {

    @Test
    public void [setCodigoInterno_ValidadorThrowsException]Test() {
        MDFInfoModalRodoviarioVeiculoReboleque obj = new MDFInfoModalRodoviarioVeiculoReboleque();
        String codigoInterno = "123456789012";
        obj.setCodigoInterno(codigoInterno);
        assertTrue(obj.getCodigoInterno().isEmpty());
    }

}