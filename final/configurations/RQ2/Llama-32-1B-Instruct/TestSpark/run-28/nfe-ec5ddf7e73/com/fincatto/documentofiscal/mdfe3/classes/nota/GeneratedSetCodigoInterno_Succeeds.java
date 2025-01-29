package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.mockito.MockitoAnnotations.initMocks;
import static org.hamcrest.Matchers.is;

public class GeneratedSetCodigoInterno_Succeeds {

    public Element element = new Element();

    @Test
    public void setCodigoInterno_Succeeds() {
        initMocks(this);
        assertEquals("12345", element.getCodigoInterno());
    }

}