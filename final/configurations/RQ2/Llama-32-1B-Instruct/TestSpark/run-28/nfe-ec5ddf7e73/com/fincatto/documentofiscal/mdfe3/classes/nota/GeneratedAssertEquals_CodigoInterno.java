package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.mockito.MockitoAnnotations.initMocks;
import static org.hamcrest.Matchers.is;

public class GeneratedAssertEquals_CodigoInterno {

    public Element element = new Element();

    @Test
    public void assertEquals_CodigoInterno() {
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        element.setCodigoInterno("12345");
        assert (mdfInfoModalRodoviarioVeiculoReboque.getCodigoInterno().equals("12345"));
    }

}