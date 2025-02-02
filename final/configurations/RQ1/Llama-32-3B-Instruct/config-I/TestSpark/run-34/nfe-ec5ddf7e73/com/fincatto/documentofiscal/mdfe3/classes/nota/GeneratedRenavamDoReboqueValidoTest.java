package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.util.Random;

public class GeneratedRenavamDoReboqueValidoTest {

    private final MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
    private static final String CODIGO_INTERNO = "1234567890";
    private static final String PLACA_REBOQUE = "ABC123";
    private static final String RENAVAM_REBOQUE = "123456789";
    private static final String TARA_REBOQUE = "100000";
    private static final String CAPACIDADE_KG = "20000";

    @Test
    public void renavamDoReboqueValidoTest() {
        mdf.setRenavam(RENAVAM_REBOQUE);
        assertEquals(RENAVAM_REBOQUE, mdf.getRenavam());
    }

}