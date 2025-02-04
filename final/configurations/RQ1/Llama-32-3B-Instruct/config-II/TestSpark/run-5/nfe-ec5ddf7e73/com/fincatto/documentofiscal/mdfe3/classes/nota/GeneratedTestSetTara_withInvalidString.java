package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.lang.reflect.Field;

public class GeneratedTestSetTara_withInvalidString {

    @Test
    public void testSetTara_withInvalidString() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        DFStringValidador.capacidadeNDigitos("a", "Tara em reboque", 5);
        obj.setTara("a");
        assertNull(obj.tara);
    }

}