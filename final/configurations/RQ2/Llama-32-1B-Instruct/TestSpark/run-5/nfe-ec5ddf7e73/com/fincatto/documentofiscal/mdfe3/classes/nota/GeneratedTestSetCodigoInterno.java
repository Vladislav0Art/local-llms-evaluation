package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestSetCodigoInterno {

    @Mock
    private Element xml;

    @InjectMocks
    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    public Element getXml() {
        return xml;
    }

    public String getCodigoInterno() {
        return mdfInfoModalRodoviarioVeiculoReboque.getCodigoInterno();
    }

    public void setCodigoInterno(final String codigoInterno) {
        when(xml.getAttribute("codigoInterno")).thenReturn(anyString());
        mdfInfoModalRodoviarioVeiculoReboque.setCodigoInterno(codigoInterno);
    }

    @Test
    public void testSetCodigoInterno() {
        setCodigoInterno("TEST");
        assertEquals("TEST", getCodigoInterno());
    }

    public Element getPlaca() {
        return xml;
    }

    public void setPlaca(final String placa) {
        when(xml.getAttribute("placa")).thenReturn(anyString());
        mdfInfoModalRodoviarioVeiculoReboque.setPlaca(placa);
    }

}