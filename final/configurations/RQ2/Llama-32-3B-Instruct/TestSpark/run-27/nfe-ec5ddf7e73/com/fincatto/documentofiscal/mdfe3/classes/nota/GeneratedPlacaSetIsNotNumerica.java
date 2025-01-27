package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Optional;

public class GeneratedPlacaSetIsNotNumerica {

    @Test
    public void placaSetIsNotNumerica() {
        final String placa = "Placa Inválida";
        final MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setPlaca(placa);
        assertThat(new DFStringValidador().isValidar(placa), is(false));
    }

}