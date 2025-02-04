package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTestRenavamSet {

    @Test
    public void testRenavamSet() {
        MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
        String renavam = "123456789";
        object.setRenavam(renavam);
        assertEquals("123456789", object.getRenavam());
    }

}