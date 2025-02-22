package com.fincatto.documentofiscal.mdfe3.classes.nota;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.simpleframework.xml.Element;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetRenavam {

    @Mock
    private MDFInfoModalRodoviarioVeiculoReboque mockReboque;

    @Test
    public void setRenavam() {
        mockReboque.setRenavam("12345678901");
        assertEquals("12345678901", mockReboque.getRenavam());
    }

}