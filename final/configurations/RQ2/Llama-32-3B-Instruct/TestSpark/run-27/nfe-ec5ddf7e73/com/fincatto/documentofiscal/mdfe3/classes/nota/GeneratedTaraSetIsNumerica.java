package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Optional;

public class GeneratedTaraSetIsNumerica {

    @Test
    public void taraSetIsNumerica() {
        final String tara = "Tara Inválida";
        final MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setTara(tara);
        assertThat(new DFStringValidador().isValidar(tara), is(true));
    }

}