package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Optional;

public class GeneratedCapacidadeM3GetIsNumerica {

    @Test
    public void capacidadeM3GetIsNumerica() {
        final String capacidadeM3 = "Capacidade M3 Inválida";
        final MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setCapacidadeM3(capacidadeM3);
        assertThat(mdf.getCapacidadeM3(), is(Optional.ofNullable(capacidadeM3).orElse(null)));
    }

}