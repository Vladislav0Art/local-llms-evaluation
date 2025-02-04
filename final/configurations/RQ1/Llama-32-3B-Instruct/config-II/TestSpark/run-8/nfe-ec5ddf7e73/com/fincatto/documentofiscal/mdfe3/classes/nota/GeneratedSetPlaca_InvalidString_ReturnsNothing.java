package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.UUID;

public class GeneratedSetPlaca_InvalidString_ReturnsNothing {

    @Test
    public void setPlaca_InvalidString_ReturnsNothing() {
        String placa = "abc";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setPlaca(placa);
        assertEquals("", obj.getPlaca());
    }

}