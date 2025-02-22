package com.fincatto.documentofiscal.mdfe3.classes.nota;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetCodigoInternoTest {

    @Mock
    private MDFInfoModalRodoviarioVeiculoReboque mockedMDFInfoModalRodoviarioVeiculoReboque;

    @Test
    public void setCodigoInternoTest() {
        String codigoInterno = "codigoInterno";
        mockedMDFInfoModalRodoviarioVeiculoReboque.setCodigoInterno(codigoInterno);
        assertEquals(mockedMDFInfoModalRodoviarioVeiculoReboque.getCodigoInterno(), codigoInterno);
    }

}