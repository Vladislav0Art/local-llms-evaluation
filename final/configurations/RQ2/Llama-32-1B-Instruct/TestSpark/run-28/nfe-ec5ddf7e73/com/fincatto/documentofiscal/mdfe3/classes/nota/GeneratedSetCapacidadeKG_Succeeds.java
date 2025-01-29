package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.mockito.MockitoAnnotations.initMocks;
import static org.hamcrest.Matchers.is;

public class GeneratedSetCapacidadeKG_Succeeds {

    public Element element = new Element();

    @Test
    public void setCapacidadeKG_Succeeds() {
        element.setCodigoInterno("12345");
        element.setRenavam("renavitam");
        element.setTara("tarav");
        element.setCapacidade KG ("capacidadeKG");
        assert (element.getCapacidade KG().equals("capacidadeKG"));
    }

}