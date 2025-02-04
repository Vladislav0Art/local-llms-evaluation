package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.lang.reflect.Field;

public class GeneratedTestSetTara_withValidString {

    @Test
    public void testSetTara_withValidString() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        DFStringValidador.capacidadeNDigitos("10", "Tara em reboque", 5);
        obj.setTara("10");
        assertEquals("10", obj.tara);
    }

}