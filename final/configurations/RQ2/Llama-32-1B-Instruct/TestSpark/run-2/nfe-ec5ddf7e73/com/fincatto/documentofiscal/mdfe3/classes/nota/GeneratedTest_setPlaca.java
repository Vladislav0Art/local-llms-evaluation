package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest_setPlaca {

    private MDFInfoModalRodoviarioVeiculoReboque object;

    @Before
    public void setUp() {
        object = new MDFInfoModalRodoviarioVeiculoReboque();
    }

    @Test
    public void test_setPlaca() {
        String placa = "XYZ456";
        element = Element.builder().name("placa").text(placa).build();
        when(object.setPlaca(element)).thenReturn(true);
        object.setPlaca(placa);

        assertEquals(placa, object.getPlaca());
    }

}