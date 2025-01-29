package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.mockito.MockitoAnnotations.initMocks;
import static org.hamcrest.Matchers.is;

public class GeneratedAssertEquals_Tara {

    public Element element = new Element();

    @Test
    public void assertEquals_Tara() {
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        element.setCodigoInterno("12345");
        element.setRenavam("renavitam");
        element.setTara("tarav");
        assert (mdfInfoModalRodoviarioVeiculoReboque.getTara().equals("tarav"));
    }

}