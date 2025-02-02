package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedSetPlacaValidoTest {

    @Test
    public void setPlacaValidoTest() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String placaValida = "ABC123";
        obj.setPlaca(placaValida);
        assertEquals("Placa do reboque", obj.getPlaca());
    }

}