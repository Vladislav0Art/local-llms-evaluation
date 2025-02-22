package com.fincatto.documentofiscal.mdfe3.classes.nota;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;
import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;

public class GeneratedShouldSetPlaca {

    private MDFInfoModalRodoviarioVeiculoReboque reboque;

    @Test
    public void shouldSetPlaca() {
        reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setPlaca("AAA1111");

        assertEquals("AAA1111", reboque.getPlaca());
    }

}