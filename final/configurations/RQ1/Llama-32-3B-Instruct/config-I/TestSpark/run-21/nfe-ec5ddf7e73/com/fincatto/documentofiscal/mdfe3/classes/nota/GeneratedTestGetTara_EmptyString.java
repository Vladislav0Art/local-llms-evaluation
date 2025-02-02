package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetTara_EmptyString {

    @Test
    public void testGetTara_EmptyString() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        String tara = "";
        modal.setTara(tara);
        assertEquals("", modal.getTara());
    }

}