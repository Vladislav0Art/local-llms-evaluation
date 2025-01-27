package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Optional;
import java.math.BigDecimal;

import org.simpleframework.xml.Element;
import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.mockito.Mockito;

public class GeneratedSetCodigoInternoSuccess {

    @Test
    public void setCodigoInternoSuccess() {
        final String codigoInterno = "123456";
        final MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setCodigoInterno(codigoInterno);
        assertThat(mdf.getCodigoInterno(), is(codigoInterno));
    }

}