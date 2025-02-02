package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedTestCodigoInternoInvalido {

    @Test
    public void testCodigoInternoInvalido() {
        String codigoInterno = "1234567";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCodigoInterno(codigoInterno);
        assertFalse(obj.getCodigoInterno().length() == 10 && !obj.getCodigoInterno().isEmpty());
    }

}