package com.fincatto.documentofiscal.mdfe3.classes.nota;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;
import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;

public class GeneratedTest {

    private MDFInfoModalRodoviarioVeiculoReboque reboque;

    @Test
    public void shouldSetCodigoInterno() {
        reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setCodigoInterno("CODIGO_TESTE");

        assertEquals("CODIGO_TESTE", reboque.getCodigoInterno());
    }

    @Test
    public void shouldSetPlaca() {
        reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setPlaca("AAA1111");

        assertEquals("AAA1111", reboque.getPlaca());
    }

    @Test
    public void shouldSetRenavam() {
        reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setRenavam("9999999999");

        assertEquals("9999999999", reboque.getRenavam());
    }

}