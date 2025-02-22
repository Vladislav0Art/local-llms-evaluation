package com.fincatto.documentofiscal.mdfe3.classes.nota;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.simpleframework.xml.Element;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetTara {

    @Mock
    private MDFInfoModalRodoviarioVeiculoReboque mockReboque;

    @Test
    public void setTara() {
        mockReboque.setTara("12345");
        assertEquals("12345", mockReboque.getTara());
    }

}