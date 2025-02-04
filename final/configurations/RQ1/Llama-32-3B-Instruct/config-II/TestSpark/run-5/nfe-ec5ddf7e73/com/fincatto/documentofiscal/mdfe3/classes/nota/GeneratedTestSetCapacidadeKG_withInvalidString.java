package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.lang.reflect.Field;

public class GeneratedTestSetCapacidadeKG_withInvalidString {

    @Test
    public void testSetCapacidadeKG_withInvalidString() throws Exception {
        Field field = MDFInfoModalRodoviarioVeiculoReboque.class.getDeclaredField("capacidadeKG");
        field.setAccessible(true);
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeKG("a");
        assertNull(field.get(obj));
    }

}