package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mock;
import org.mockito.Mockito;

public class GeneratedTestSetCodigoInterno {

    @Mock
    private MDFInfoModalRodoviarioVeiculoReboque reboque;

    @Test
    public void testSetCodigoInterno() {
        reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setCodigoInterno("1234567890");
        assertEquals("1234567890", reboque.getCodigoInterno());
    }

}