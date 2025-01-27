package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Optional;
import java.math.BigDecimal;

import org.simpleframework.xml.Element;
import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.mockito.Mockito;

public class GeneratedGetCapacidadeKGSuccess {

    @Test
    public void getCapacidadeKGSuccess() {
        final MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setCapacidadeKG("100kg");
        assertThat(mdf.getCapacidadeKG(), is("100kg"));
    }

}