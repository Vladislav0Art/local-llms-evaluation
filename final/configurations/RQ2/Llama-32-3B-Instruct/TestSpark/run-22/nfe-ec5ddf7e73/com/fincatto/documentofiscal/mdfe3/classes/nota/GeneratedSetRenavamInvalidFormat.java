package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSetRenavamInvalidFormat {

    @Test
    public void setRenavamInvalidFormat() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        boolean validador = false;
        String renavam = "abc123";
        when(modal.getValidador()).thenReturn(validador);
        String result = modal.setRenavam(renavam);
        assertEquals("Invalid format", result);
    }

}