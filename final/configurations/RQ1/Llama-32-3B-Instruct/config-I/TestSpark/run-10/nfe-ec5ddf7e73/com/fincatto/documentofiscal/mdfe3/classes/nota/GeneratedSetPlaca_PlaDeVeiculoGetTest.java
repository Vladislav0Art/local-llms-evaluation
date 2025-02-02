package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Random;

public class GeneratedSetPlaca_PlaDeVeiculoGetTest {

    @Test
    public void setPlaca_PlaDeVeiculoGetTest() {
        final String placa = "ABC123";
        final MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setPlaca(placa);
        assertEquals(placa, reboque.getPlaca());
    }

}