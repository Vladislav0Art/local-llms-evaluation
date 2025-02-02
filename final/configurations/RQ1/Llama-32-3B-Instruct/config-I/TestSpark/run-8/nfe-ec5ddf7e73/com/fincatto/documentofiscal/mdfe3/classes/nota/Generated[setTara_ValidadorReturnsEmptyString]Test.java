package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class Generated[setTara_ValidadorReturnsEmptyString]

Test {

    @Test
    public void [setTara_ValidadorReturnsEmptyString]Test() {
        MDFInfoModalRodoviarioVeiculoReboleque obj = new MDFInfoModalRodoviarioVeiculoReboleque();
        String tara = "123456";
        obj.setTara(tara);
        assertEquals("", obj.getTara());
    }

}