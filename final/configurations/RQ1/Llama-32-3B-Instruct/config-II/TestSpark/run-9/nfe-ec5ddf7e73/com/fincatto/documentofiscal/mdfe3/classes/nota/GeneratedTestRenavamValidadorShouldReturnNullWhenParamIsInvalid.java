package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.UUID;

public class GeneratedTestRenavamValidadorShouldReturnNullWhenParamIsInvalid {

    @Test
    public void testRenavamValidadorShouldReturnNullWhenParamIsInvalid() {
        String invalidRenvam = "a".repeat(11);
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setRenavam(invalidRenvam);
        assertThat(obj.getRenavam(), is(null));
    }

}