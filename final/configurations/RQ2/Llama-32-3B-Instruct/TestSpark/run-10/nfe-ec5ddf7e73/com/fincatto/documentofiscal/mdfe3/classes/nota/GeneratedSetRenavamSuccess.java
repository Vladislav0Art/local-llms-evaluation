package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Optional;
import java.math.BigDecimal;

import org.simpleframework.xml.Element;
import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.mockito.Mockito;

public class GeneratedSetRenavamSuccess {

    @Test
    public void setRenavamSuccess() {
        final String renavam = "1234567890";
        final MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setRenavam(renavam);
        assertThat(mdf.getRenavam(), is(renavam));
    }

}