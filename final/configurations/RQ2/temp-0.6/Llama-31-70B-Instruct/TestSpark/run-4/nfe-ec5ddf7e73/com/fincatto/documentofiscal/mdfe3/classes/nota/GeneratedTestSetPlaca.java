package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mock;
import org.mockito.Mockito;

public class GeneratedTestSetPlaca {

    @Mock
    private MDFInfoModalRodoviarioVeiculoReboque reboque;

    @Test
    public void testSetPlaca() {
        reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setPlaca("AAA1234");
        assertEquals("AAA1234", reboque.getPlaca());
    }

}