package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.mockito.Mock;

import static org.mockito.MockitoAnnotations.initMocks;

public class GeneratedSetCodigoInternoTest {

    @Mock
    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Before
    public void setup() {
        initMocks(this);
    }

    @Test
    public void setCodigoInternoTest() {
        final String codigoInterno = "123456";
        mdfInfoModalRodoviarioVeiculoReboque.setCodigoInterno(codigoInterno);
        assertEquals(codigoInterno, mdfInfoModalRodoviarioVeiculoReboque.getCodigoInterno());
    }

}