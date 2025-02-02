package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class Generated[setRenavam_ValidadorThrowsException]

Test {

    @Test
    public void [setRenavam_ValidadorThrowsException]Test() {
        MDFInfoModalRodoviarioVeiculoReboleque obj = new MDFInfoModalRodoviarioVeiculoReboleque();
        String renavamInvalido = "123456789";
        obj.setRenavam(renavamInvalido);
        assertTrue(obj.getRenavam().isEmpty());
    }

}