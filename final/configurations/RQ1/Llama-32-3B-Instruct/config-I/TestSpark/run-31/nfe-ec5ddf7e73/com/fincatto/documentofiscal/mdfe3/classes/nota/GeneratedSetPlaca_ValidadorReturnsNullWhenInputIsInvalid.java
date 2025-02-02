package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetPlaca_ValidadorReturnsNullWhenInputIsInvalid {

    @Test
    public void setPlaca_ValidadorReturnsNullWhenInputIsInvalid() {
        String placa = "InvalidInput";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setPlaca(placa);
        assertNull(obj.getPlaca());
    }

}