package com.fincatto.documentofiscal.mdfe3.classes.nota;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class GeneratedGetCapacidadeKGTest {

    @Mock
    MDFInfoModalRodoviarioVeiculoReboque reboque;

    @Test
    public void getCapacidadeKGTest() {
        reboque.setCapacidadeKG("12345");
        assertEquals("12345", reboque.getCapacidadeKG());
    }

}