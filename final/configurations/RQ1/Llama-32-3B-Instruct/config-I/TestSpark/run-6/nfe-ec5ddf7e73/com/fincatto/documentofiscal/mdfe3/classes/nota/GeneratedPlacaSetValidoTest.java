package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedPlacaSetValidoTest {

    @Test
    public void placaSetValidoTest() {
        String placa = "ABC123";
        new MDFInfoModalRodoviarioVeiculoReboque().setPlaca(placa);
        assertEquals("ABC123", new MDFInfoModalRodoviarioVeiculoReboque().getPlaca());
    }

}