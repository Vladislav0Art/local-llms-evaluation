package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSetCodigoInternoEmptyString {

    @Test
    public void setCodigoInternoEmptyString() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        String result = modal.setCodigoInterno("");
        assertEquals("", result);
    }

}