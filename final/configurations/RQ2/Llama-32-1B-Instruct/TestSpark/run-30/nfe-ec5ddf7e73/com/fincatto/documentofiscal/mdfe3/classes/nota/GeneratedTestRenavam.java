package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestRenavam {

    @Test
    public void testRenavam() {
        String renavam = "DEF456";
        MDFInfoModalRodoviarioVeiculoReboque notar = new MDFInfoModalRodoviarioVeiculoReboque();
        notar.setRenavam(renavam);
        assertEquals(renavam, notar.getRenavam());
    }

}