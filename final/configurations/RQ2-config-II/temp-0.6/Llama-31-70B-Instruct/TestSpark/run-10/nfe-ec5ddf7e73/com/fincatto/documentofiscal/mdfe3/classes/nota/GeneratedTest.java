package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

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

    @Test
    public void setPlacaTest() {
        String placa = "ABC1234";
        testClass.setPlaca(placa);
        assertEquals(placa, testClass.getPlaca());
    }

    @Test
    public void setRenavamTest() {
        String renavam = "12345678910";
        testClass.setRenavam(renavam);
        assertEquals(renavam, testClass.getRenavam());
    }

    @Test
    public void setTaraTest() {
        String tara = "12345";
        testClass.setTara(tara);
        assertEquals(tara, testClass.getTara());
    }

}