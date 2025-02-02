package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRenavamSetInvalidoTest {

    @Test
    public void renavamSetInvalidoTest() {
        String renavam = "abcdefghi";
        DFStringValidador.validaIntervalo(renavam, 9, 11, "Renavam do reboque");
        new MDFInfoModalRodoviarioVeiculoReboque().setRenavam(renavam);
        assertEquals("123456789", new MDFInfoModalRodoviarioVeiculoReboque().getRenavam());
    }

}