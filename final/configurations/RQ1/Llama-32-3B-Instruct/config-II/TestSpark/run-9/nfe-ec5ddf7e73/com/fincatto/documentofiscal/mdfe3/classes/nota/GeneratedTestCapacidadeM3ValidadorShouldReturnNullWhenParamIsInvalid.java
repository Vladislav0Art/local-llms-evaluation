package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.UUID;

public class GeneratedTestCapacidadeM3ValidadorShouldReturnNullWhenParamIsInvalid {

    @Test
    public void testCapacidadeM3ValidadorShouldReturnNullWhenParamIsInvalid() {
        String invalidCapacity = "a".repeat(3);
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeM3(invalidCapacity);
        assertThat(obj.getCapacidadeM3(), is(null));
    }
}

}