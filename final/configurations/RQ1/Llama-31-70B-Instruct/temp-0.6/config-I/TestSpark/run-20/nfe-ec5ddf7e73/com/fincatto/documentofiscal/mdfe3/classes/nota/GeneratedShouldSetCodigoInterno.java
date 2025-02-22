package com.fincatto.documentofiscal.mdfe3.classes.nota;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;
import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;

public class GeneratedShouldSetCodigoInterno {

    private MDFInfoModalRodoviarioVeiculoReboque reboque;

    @Test
    public void shouldSetCodigoInterno() {
        reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setCodigoInterno("CODIGO_TESTE");

        assertEquals("CODIGO_TESTE", reboque.getCodigoInterno());
    }

}