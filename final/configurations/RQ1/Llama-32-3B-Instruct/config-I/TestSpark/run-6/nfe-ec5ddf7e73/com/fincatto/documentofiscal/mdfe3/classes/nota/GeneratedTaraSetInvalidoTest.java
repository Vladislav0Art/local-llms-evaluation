package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTaraSetInvalidoTest {

    @Test
    public void taraSetInvalidoTest() {
        String tara = "abcdefgh";
        new MDFInfoModalRodoviarioVeiculoReboque().setTara(tara);
        assertEquals("10000", new MDFInfoModalRodoviarioVeiculoReboque().getTara());
    }

}