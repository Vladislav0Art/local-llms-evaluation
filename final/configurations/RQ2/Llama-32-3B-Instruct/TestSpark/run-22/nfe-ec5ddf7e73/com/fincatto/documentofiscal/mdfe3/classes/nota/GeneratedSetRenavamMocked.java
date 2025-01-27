package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSetRenavamMocked {

    @Test
    public void setRenavamMocked() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        String renavam = "ABC123";
        DFStringValidador validador = mock(DFStringValidador.class);
        when(validador.isValid(renavam)).thenReturn(true);
        modal.setRenavam(renavam, validador);
        assertEquals(renavam, modal.getRenavam());
    }

}