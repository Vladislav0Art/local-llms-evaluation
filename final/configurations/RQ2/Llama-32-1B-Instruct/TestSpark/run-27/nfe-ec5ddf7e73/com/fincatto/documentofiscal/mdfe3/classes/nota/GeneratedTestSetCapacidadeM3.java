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
public class GeneratedTestSetCapacidadeM3 {

    @Mock
    private Element element;

    @InjectMocks
    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void testSetCapacidadeM3() {
        when(element.get("capacidade-m3")).thenReturn("test");
        String m3 = "test";
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeM3(m3);
        assertEquals("test", mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeM3());
    }

}