package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestPlaca {

    @Test
    public void testPlaca() {
        String placa = "ABC123";
        MDFInfoModalRodoviarioVeiculoReboque notar = new MDFInfoModalRodoviarioVeiculoReboque();
        notar.setPlaca(placa);
        assertEquals(placa, notar.getPlaca());
    }

}