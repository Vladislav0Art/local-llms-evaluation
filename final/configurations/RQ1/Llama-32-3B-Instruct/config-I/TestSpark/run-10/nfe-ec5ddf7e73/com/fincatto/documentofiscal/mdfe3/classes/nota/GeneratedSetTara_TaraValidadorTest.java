package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Random;

public class GeneratedSetTara_TaraValidadorTest {

    @Test
    public void setTara_TaraValidadorTest() {
        final String tara = "12345";
        new MDFInfoModalRodoviarioVeiculoReboque().setTara(tara);
        assertEquals("12345", new MDFInfoModalRodoviarioVeiculoReboque().getTara());
    }

}