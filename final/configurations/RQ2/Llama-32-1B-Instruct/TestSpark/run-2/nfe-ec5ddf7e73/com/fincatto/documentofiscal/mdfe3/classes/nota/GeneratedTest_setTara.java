package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest_setTara {

    private MDFInfoModalRodoviarioVeiculoReboque object;

    @Before
    public void setUp() {
        object = new MDFInfoModalRodoviarioVeiculoReboque();
    }

    @Test
    public void test_setTara() {
        String tara = "JKL012";
        element = Element.builder().name("tara").text(tara).build();
        when(object.setTara(element)).thenReturn(true);
        object.setTara(tara);

        assertEquals(tara, object.getTara());
    }

}