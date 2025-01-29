package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestSetRenavam {

    @Test
    public void testSetRenavam() {
        MDFInfoModalRodoviarioVeiculoReboque modelo = new MDFInfoModalRodoviarioVeiculoReboque();
        String renavam = "REN-DEF";
        modelo.setRenavam(renavam);
        assertEquals(renavam, modelo.getRenavam());
    }

}