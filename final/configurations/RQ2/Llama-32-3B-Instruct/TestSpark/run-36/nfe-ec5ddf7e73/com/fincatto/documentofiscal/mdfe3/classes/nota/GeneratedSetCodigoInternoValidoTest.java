package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedSetCodigoInternoValidoTest {

    @Test
    public void setCodigoInternoValidoTest() {
        String codigoInterno = "123456";
        DFStringValidador validador = new DFStringValidador();
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCodigoInterno(codigoInterno);
        assertTrue(validador.isValid(obj.getCodigoInterno()));
    }

}