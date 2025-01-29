package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestSetCapacidadeKG {

    @Mock
    private Element element;

    @InjectMocks
    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void testSetCapacidadeKG() {
        when(element.get("capacidade-kg")).thenReturn("test");
        String kg = "test";
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeKG(kg);
        assertEquals("test", mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeKG());
    }

}