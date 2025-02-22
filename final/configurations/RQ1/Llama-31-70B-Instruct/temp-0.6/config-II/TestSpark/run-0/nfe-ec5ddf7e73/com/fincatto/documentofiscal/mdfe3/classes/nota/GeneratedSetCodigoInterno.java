package com.fincatto.documentofiscal.mdfe3.classes.nota;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.simpleframework.xml.Element;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetCodigoInterno {

    @Mock
    private MDFInfoModalRodoviarioVeiculoReboque mockReboque;

    @Test
    public void setCodigoInterno() {
        mockReboque.setCodigoInterno("1234567890");
        assertEquals("1234567890", mockReboque.getCodigoInterno());
    }

}