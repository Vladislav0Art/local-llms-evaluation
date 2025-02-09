package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedSetCodigoInternoInvalidoTest {

    @Test
    public void setCodigoInternoInvalidoTest() {
        String codigoInterno = "abc";
        DFStringValidador validador = new DFStringValidador();
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCodigoInterno(codigoInterno);
        assertFalse(validador.isValid(obj.getCodigoInterno()));
    }

}