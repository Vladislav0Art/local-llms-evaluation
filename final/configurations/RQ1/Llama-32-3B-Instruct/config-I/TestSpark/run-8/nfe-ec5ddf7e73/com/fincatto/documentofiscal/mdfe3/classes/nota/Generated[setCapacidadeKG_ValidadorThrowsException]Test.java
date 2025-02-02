package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class Generated[setCapacidadeKG_ValidadorThrowsException]

Test {

    @Test
    public void [setCapacidadeKG_ValidadorThrowsException]Test() {
        MDFInfoModalRodoviarioVeiculoReboleque obj = new MDFInfoModalRodoviarioVeiculoReboleque();
        String capacidadeKgInvalida = "12";
        obj.setCapacidadeKG(capacidadeKgInvalida);
        assertTrue(obj.getCapacidadeKG().isEmpty());
    }

}