package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.util.Random;

public class GeneratedCapacidadeM3InvalidoTest {

    private final MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
    private static final String CODIGO_INTERNO = "1234567890";
    private static final String PLACA_REBOQUE = "ABC123";
    private static final String RENAVAM_REBOQUE = "123456789";
    private static final String TARA_REBOQUE = "100000";
    private static final String CAPACIDADE_KG = "20000";

    @Test
    public void capacidadeM3InvalidoTest() {
        String invalida = "20000";
        assertEquals("00", mdf.getCapacidadeM3());
    }

    private void setField(String fieldName, Object value) throws NoSuchFieldException, IllegalAccessException {
        Field field = mdf.getClass().getDeclaredField(fieldName);
        field.setAccessible(true);
        field.set(mdf, value);
    }

}