package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

public class Generated[setRenavam_Invalido]

Test {

    @Test
    public void [setRenavam_Invalido]Test() {
        try {
            Field field = MDFInfoModalRodoviarioVeiculoReboque.class.getDeclaredField("renavam");
            field.setAccessible(true);
            ((MDFInfoModalRodoviarioVeiculoReboque) mockObject).renavam = "12345678901234567890";
            new Object[]{(MDFInfoModalRodoviarioVeiculoReboque) mockObject}.getClass().getMethod("setRenavam", String.class).invoke(null, "");
            fail("Should throw IllegalArgumentException");
        } catch (Exception e) {
            // pass
        }
    }

}