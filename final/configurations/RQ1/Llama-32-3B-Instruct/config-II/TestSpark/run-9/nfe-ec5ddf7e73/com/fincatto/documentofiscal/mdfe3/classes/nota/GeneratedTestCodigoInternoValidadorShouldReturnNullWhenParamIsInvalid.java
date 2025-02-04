package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.UUID;

public class GeneratedTestCodigoInternoValidadorShouldReturnNullWhenParamIsInvalid {

    @Test
    public void testCodigoInternoValidadorShouldReturnNullWhenParamIsInvalid() {
        String invalidCode = "a".repeat(11);
        String validCode = "ABC123456";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCodigoInterno(invalidCode);
        assertThat(obj.getCodigoInterno(), is(validCode));
    }

}