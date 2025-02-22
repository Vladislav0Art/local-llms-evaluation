package com.fincatto.documentofiscal.mdfe3.classes.nota;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;
import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;

public class GeneratedShouldSetRenavam {

    private MDFInfoModalRodoviarioVeiculoReboque reboque;

    @Test
    public void shouldSetRenavam() {
        reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setRenavam("9999999999");

        assertEquals("9999999999", reboque.getRenavam());
    }

}