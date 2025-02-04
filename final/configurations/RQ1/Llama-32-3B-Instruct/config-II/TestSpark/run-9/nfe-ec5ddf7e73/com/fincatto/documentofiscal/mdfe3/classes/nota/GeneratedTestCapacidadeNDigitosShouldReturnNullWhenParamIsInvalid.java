package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.UUID;

public class GeneratedTestCapacidadeNDigitosShouldReturnNullWhenParamIsInvalid {

    @Test
    public void testCapacidadeNDigitosShouldReturnNullWhenParamIsInvalid() {
        String invalidCapacity = "a".repeat(6);
        DFStringValidador capacidadeNDigitos = new DFStringValidador();
        capacidadeNDigitos.setTara(invalidCapacity);
        assertThat(capacidadeNDigitos.getTara(), is(null));
    }
}

}