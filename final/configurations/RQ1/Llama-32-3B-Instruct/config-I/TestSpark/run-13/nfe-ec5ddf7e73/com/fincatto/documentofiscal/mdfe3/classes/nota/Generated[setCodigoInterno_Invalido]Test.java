package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

public class Generated[setCodigoInterno_Invalido]

Test {

    @Test
    public void [setCodigoInterno_Invalido]Test() {
        try {
            Field field = MDFInfoModalRodoviarioVeiculoReboque.class.getDeclaredField("codigoInterno");
            field.setAccessible(true);
            ((MDFInfoModalRodoviarioVeiculoReboque) mockObject).codigoInterno = "12345678901234567890";
            new Object[]{(MDFInfoModalRodoviarioVeiculoReboque) mockObject}.getClass().getMethod("setCodigoInterno", String.class).invoke(null, "");
            fail("Should throw IllegalArgumentException");
        } catch (Exception e) {
            // pass
        }
    }

}