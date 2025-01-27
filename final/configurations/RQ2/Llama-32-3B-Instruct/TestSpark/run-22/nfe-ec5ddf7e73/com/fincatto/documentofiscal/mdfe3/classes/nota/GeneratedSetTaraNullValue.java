package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSetTaraNullValue {

    @Test
    public void setTaraNullValue() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        String tara = null;
        when(modal.getValidador()).thenReturn(false);
        String result = modal.setTara(tara);
        assertEquals("Invalid value", result);
    }

    public class DFStringValidador {
        boolean isValid(String string) {
            return true;
        }
    }

}