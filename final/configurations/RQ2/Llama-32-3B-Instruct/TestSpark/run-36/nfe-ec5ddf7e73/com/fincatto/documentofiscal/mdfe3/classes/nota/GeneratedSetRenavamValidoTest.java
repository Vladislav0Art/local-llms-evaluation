package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedSetRenavamValidoTest {

    @Test
    public void setRenavamValidoTest() {
        String renavam = "1234567890";
        DFStringValidador validador = new DFStringValidador();
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setRenavam(renavam);
        assertTrue(validador.isValid(obj.getRenavam()));
    }

}