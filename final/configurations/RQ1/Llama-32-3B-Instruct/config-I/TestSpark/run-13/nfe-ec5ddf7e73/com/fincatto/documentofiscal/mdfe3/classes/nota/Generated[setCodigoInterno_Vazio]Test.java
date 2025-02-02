package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

public class Generated[setCodigoInterno_Vazio]

Test {

    @Test
    public void [setCodigoInterno_Vazio]Test() {
        try {
            Field field = MDFInfoModalRodoviarioVeiculoReboque.class.getDeclaredField("codigoInterno");
            field.setAccessible(true);
            ((MDFInfoModalRodoviarioVeiculoReboque) mockObject).codigoInterno = "";
            new Object[]{(MDFInfoModalRodoviarioVeiculoReboque) mockObject}.getClass().getMethod("setCodigoInterno", String.class).invoke(null, "");
            fail("Should throw IllegalArgumentException");
        } catch (Exception e) {
            // pass
        }
    }

}