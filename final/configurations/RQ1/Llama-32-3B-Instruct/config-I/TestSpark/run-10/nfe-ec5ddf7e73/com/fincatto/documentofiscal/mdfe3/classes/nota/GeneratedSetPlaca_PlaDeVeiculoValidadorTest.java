package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Random;

public class GeneratedSetPlaca_PlaDeVeiculoValidadorTest {

    @Test
    public void setPlaca_PlaDeVeiculoValidadorTest() {
        final String placa = "ABC123";
        new MDFInfoModalRodoviarioVeiculoReboque().setPlaca(placa);
        assertEquals(placa, new MDFInfoModalRodoviarioVeiculoReboque().getPlaca());
    }

}