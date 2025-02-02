package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTaraSetValidoTest {

    @Test
    public void taraSetValidoTest() {
        String tara = "10000";
        new MDFInfoModalRodoviarioVeiculoReboque().setTara(tara);
        assertEquals("10000", new MDFInfoModalRodoviarioVeiculoReboque().getTara());
    }

}