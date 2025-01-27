package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Optional;

public class GeneratedRenavamSetIsNotNumerica {

    @Test
    public void renavamSetIsNotNumerica() {
        final String renavam = "Renavam Inválida";
        final MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setRenavam(renavam);
        assertThat(new DFStringValidador().isValidar(renavam), is(false));
    }

}