package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.mockito.MockitoAnnotations.initMocks;
import static org.hamcrest.Matchers.is;

public class GeneratedSetRenavam_Succeeds {

    public Element element = new Element();

    @Test
    public void setRenavam_Succeeds() {
        element.setCodigoInterno("12345");
        element.setRenavam("renavitam");
        assert (element.getRenavam().equals("renavitam"));
    }

}