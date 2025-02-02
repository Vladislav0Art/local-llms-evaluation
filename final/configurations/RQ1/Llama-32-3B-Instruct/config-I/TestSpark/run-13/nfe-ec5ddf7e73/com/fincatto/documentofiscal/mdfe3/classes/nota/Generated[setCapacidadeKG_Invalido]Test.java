package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

public class Generated[setCapacidadeKG_Invalido]

Test {

    @Test
    public void [setCapacidadeKG_Invalido]Test() {
        try {
            Field field = MDFInfoModalRodoviarioVeiculoReboque.class.getDeclaredField("capacidadeKG");
            field.setAccessible(true);
            ((MDFInfoModalRodoviarioVeiculoReboque) mockObject).capacidadeKG = "12345678901234567890";
            new Object[]{(MDFInfoModalRodoviarioVeiculoReboque) mockObject}.getClass().getMethod("setCapacidadeKG", String.class).invoke(null, "");
            fail("Should throw IllegalArgumentException");
        } catch (Exception e) {
            // pass
        }
    }

}