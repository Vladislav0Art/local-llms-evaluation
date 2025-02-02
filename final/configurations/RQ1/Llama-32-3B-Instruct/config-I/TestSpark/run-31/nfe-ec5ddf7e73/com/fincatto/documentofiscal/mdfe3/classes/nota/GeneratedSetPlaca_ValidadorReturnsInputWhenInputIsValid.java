package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetPlaca_ValidadorReturnsInputWhenInputIsValid {

    @Test
    public void setPlaca_ValidadorReturnsInputWhenInputIsValid() {
        String placa = "ABC123";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setPlaca(placa);
        assertEquals("ABC123", obj.getPlaca());
    }

}