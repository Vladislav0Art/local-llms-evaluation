package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class Generated[setCapacidadeM3_ValidadorReturnsEmptyString]

Test {

    @Test
    public void [setCapacidadeM3_ValidadorReturnsEmptyString]Test() {
        MDFInfoModalRodoviarioVeiculoReboleque obj = new MDFInfoModalRodoviarioVeiculoReboleque();
        String capacidadeM3 = "12";
        obj.setCapacidadeM3(capacidadeM3);
        assertEquals("", obj.getCapacidadeM3());
    }

}