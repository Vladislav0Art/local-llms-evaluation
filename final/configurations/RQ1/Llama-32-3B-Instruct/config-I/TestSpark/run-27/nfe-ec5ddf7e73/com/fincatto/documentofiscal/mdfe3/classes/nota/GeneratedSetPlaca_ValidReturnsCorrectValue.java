package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;

public class GeneratedSetPlaca_ValidReturnsCorrectValue {

    @Test
    public void setPlaca_ValidReturnsCorrectValue() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String placa = "ABC123";
        obj.setPlaca(placa);
        assertEquals("ABC123", obj.getPlaca());
    }

}