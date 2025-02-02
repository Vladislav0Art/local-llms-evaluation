package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class Generated[setTara_ValidadorThrowsException]

Test {

    @Test
    public void [setTara_ValidadorThrowsException]Test() {
        MDFInfoModalRodoviarioVeiculoReboleque obj = new MDFInfoModalRodoviarioVeiculoReboleque();
        String taraInvalida = "123456";
        obj.setTara(taraInvalida);
        assertTrue(obj.getTara().isEmpty());
    }

}