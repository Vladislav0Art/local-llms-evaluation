package com.fincatto.documentofiscal.mdfe3.classes.nota;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.simpleframework.xml.Element;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private MDFInfoModalRodoviarioVeiculoReboque mockReboque;

    @Test
    public void setCodigoInterno() {
        mockReboque.setCodigoInterno("1234567890");
        assertEquals("1234567890", mockReboque.getCodigoInterno());
    }

    @Test
    public void setPlaca() {
        mockReboque.setPlaca("ABC1234");
        assertEquals("ABC1234", mockReboque.getPlaca());
    }

    @Test
    public void setRenavam() {
        mockReboque.setRenavam("12345678901");
        assertEquals("12345678901", mockReboque.getRenavam());
    }

    @Test
    public void setTara() {
        mockReboque.setTara("12345");
        assertEquals("12345", mockReboque.getTara());
    }

    @Test
    public void setCapacidadeKG() {
        mockReboque.setCapacidadeKG("12345");
        assertEquals("12345", mockReboque.getCapacidadeKG());
    }

}