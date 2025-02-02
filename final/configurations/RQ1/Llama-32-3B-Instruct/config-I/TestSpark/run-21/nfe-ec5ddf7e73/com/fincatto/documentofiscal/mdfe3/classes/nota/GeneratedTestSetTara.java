package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestSetTara {

    @Test
    public void testSetTara() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        String tara = "12345";
        modal.setTara(tara);
        assertEquals(tara, modal.getTara());
    }

}