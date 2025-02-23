package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetCodigoInternoTest {

    @Mock
    private MDFInfoModalRodoviarioVeiculoReboque mockedMDFInfoModalRodoviarioVeiculoReboque;

    @InjectMocks
    private MDFInfoModalRodoviarioVeiculoReboque testClass;

    @Test
    public void setCodigoInternoTest() {
        String codigoInterno = "1234567890";
        testClass.setCodigoInterno(codigoInterno);
        assertEquals(codigoInterno, testClass.getCodigoInterno());
    }

}