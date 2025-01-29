package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.mockito.MockitoAnnotations.initMocks;
import static org.hamcrest.Matchers.is;

public class GeneratedSetTara_Succeeds {

    public Element element = new Element();

    @Test
    public void setTara_Succeeds() {
        element.setCodigoInterno("12345");
        element.setRenavam("renavitam");
        element.setTara("tarav");
        assert (element.getTara().equals("tarav"));
    }

}