package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.lang.reflect.Field;

public class GeneratedTestSetRenavam_withValidString {

    @Test
    public void testSetRenavam_withValidString() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        DFStringValidador.renavamDeVeiculo("1234", "Renavam do reboque");
        obj.setRenavam("1234");
        assertEquals("1234", obj.renavam);
    }

}