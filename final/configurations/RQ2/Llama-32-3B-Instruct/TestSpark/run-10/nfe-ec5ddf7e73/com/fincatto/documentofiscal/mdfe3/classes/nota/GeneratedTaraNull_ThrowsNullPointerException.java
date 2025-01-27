package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Optional;
import java.math.BigDecimal;

import org.simpleframework.xml.Element;
import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.mockito.Mockito;

public class GeneratedTaraNull_ThrowsNullPointerException {

    @Test
    public void taraNull_ThrowsNullPointerException() {
        final MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        assertThrows(NullPointerException.class, () -> mdf.setTara(null));
    }

}