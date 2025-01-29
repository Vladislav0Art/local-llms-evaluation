package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest_setRenavam {

    private MDFInfoModalRodoviarioVeiculoReboque object;

    @Before
    public void setUp() {
        object = new MDFInfoModalRodoviarioVeiculoReboque();
    }

    @Test
    public void test_setRenavam() {
        String renavam = "GHI789";
        element = Element.builder().name("renavam").text(renavam).build();
        when(object.setRenavam(element)).thenReturn(true);
        object.setRenavam(renavam);

        assertEquals(renavam, object.getRenavam());
    }

}