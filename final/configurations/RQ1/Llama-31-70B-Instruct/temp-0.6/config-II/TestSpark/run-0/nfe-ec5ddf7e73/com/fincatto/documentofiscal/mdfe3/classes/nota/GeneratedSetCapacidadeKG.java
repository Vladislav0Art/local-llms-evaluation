package com.fincatto.documentofiscal.mdfe3.classes.nota;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.simpleframework.xml.Element;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetCapacidadeKG {

    @Mock
    private MDFInfoModalRodoviarioVeiculoReboque mockReboque;

    @Test
    public void setCapacidadeKG() {
        mockReboque.setCapacidadeKG("12345");
        assertEquals("12345", mockReboque.getCapacidadeKG());
    }

}