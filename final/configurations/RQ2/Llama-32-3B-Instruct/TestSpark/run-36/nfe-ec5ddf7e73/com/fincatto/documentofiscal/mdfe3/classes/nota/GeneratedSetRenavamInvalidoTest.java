package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedSetRenavamInvalidoTest {

    @Test
    public void setRenavamInvalidoTest() {
        String renavam = "abc";
        DFStringValidador validador = new DFStringValidador();
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setRenavam(renavam);
        assertFalse(validador.isValid(obj.getRenavam()));
    }

}