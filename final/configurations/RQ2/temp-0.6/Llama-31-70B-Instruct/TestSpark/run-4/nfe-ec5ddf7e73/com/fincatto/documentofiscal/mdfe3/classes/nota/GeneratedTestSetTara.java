package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mock;
import org.mockito.Mockito;

public class GeneratedTestSetTara {

    @Mock
    private MDFInfoModalRodoviarioVeiculoReboque reboque;

    @Test
    public void testSetTara() {
        reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setTara("12345");
        assertEquals("12345", reboque.getTara());
    }

}