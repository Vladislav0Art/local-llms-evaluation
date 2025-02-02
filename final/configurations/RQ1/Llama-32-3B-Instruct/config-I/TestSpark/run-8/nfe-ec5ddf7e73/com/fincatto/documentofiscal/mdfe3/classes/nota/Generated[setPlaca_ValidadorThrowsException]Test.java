package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class Generated[setPlaca_ValidadorThrowsException]

Test {

    @Test
    public void [setPlaca_ValidadorThrowsException]Test() {
        MDFInfoModalRodoviarioVeiculoReboleque obj = new MDFInfoModalRodoviarioVeiculoReboleque();
        String placaInvalida = "1234567890";
        obj.setPlaca(placaInvalida);
        assertTrue(obj.getPlaca().isEmpty());
    }

}