package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.UUID;

public class GeneratedTestTaraValidadorShouldReturnNullWhenParamIsInvalid {

    @Test
    public void testTaraValidadorShouldReturnNullWhenParamIsInvalid() {
        String invalidTara = "a".repeat(6);
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setTara(invalidTara);
        assertThat(obj.getTara(), is(null));
    }

}