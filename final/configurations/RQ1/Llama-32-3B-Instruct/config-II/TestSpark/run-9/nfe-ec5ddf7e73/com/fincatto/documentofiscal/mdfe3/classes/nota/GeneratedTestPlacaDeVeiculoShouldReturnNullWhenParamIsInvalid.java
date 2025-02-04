package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.UUID;

public class GeneratedTestPlacaDeVeiculoShouldReturnNullWhenParamIsInvalid {

    @Test
    public void testPlacaDeVeiculoShouldReturnNullWhenParamIsInvalid() {
        String invalidPlate = "a".repeat(9);
        DFStringValidador placaDeVeiculo = new DFStringValidador();
        placaDeVeiculo.setPlaca(invalidPlate);
        assertThat(placaDeVeiculo.getPlaca(), is(null));
    }

}