package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.UUID;

public class GeneratedSetPlaca_ValidString_ReturnsValidString {

    @Test
    public void setPlaca_ValidString_ReturnsValidString() {
        String placa = "1234567890";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setPlaca(placa);
        assertEquals(placa, obj.getPlaca());
    }

}