package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Optional;

public class GeneratedCapacidadeM3SetIsNumerica {

    @Test
    public void capacidadeM3SetIsNumerica() {
        final String capacidadeM3 = "Capacidade M3 Inválida";
        final MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setCapacidadeM3(capacidadeM3);
        assertThat(new DFStringValidador().isValidar(capacidadeM3), is(true));
    }

}