package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Optional;

public class GeneratedCapacidadeKGSetIsNumerica {

    @Test
    public void capacidadeKGSetIsNumerica() {
        final String capacidadeKG = "Capacidade KG Inválida";
        final MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setCapacidadeKG(capacidadeKG);
        assertThat(new DFStringValidador().isValidar(capacidadeKG), is(true));
    }

}