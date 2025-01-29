package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestTara {

    @Test
    public void testTara() {
        String tara = "GHI789";
        MDFInfoModalRodoviarioVeiculoReboque notar = new MDFInfoModalRodoviarioVeiculoReboque();
        notar.setTara(tara);
        assertEquals(tara, notar.getTara());
    }

}