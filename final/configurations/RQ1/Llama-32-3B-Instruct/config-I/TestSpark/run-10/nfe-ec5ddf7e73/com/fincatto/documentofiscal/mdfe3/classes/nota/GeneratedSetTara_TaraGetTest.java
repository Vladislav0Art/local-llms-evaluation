package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Random;

public class GeneratedSetTara_TaraGetTest {

    @Test
    public void setTara_TaraGetTest() {
        final String tara = "12345";
        final MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setTara(tara);
        assertEquals(tara, reboque.getTara());
    }

}