package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.UUID;

public class GeneratedTestCapacidadeKGValidadorShouldReturnNullWhenParamIsInvalid {

    @Test
    public void testCapacidadeKGValidadorShouldReturnNullWhenParamIsInvalid() {
        String invalidCapacity = "a".repeat(6);
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeKG(invalidCapacity);
        assertThat(obj.getCapacidadeKG(), is(null));
    }

}