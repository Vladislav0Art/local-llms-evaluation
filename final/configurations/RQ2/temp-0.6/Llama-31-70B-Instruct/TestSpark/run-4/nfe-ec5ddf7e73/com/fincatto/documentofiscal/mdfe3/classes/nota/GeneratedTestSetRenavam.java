package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mock;
import org.mockito.Mockito;

public class GeneratedTestSetRenavam {

    @Mock
    private MDFInfoModalRodoviarioVeiculoReboque reboque;

    @Test
    public void testSetRenavam() {
        reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setRenavam("12345678912");
        assertEquals("12345678912", reboque.getRenavam());
    }

}