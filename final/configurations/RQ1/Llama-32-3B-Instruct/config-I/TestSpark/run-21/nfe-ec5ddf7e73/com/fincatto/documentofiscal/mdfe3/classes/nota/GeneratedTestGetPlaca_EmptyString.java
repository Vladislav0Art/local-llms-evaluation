package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetPlaca_EmptyString {

    @Test
    public void testGetPlaca_EmptyString() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        String placa = "";
        modal.setPlaca(placa);
        assertEquals("", modal.getPlaca());
    }

}