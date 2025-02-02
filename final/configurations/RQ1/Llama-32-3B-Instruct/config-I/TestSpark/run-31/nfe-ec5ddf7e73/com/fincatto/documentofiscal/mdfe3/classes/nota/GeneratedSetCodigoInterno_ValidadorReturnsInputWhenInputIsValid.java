package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetCodigoInterno_ValidadorReturnsInputWhenInputIsValid {

    @Test
    public void setCodigoInterno_ValidadorReturnsInputWhenInputIsValid() {
        String codigoInterno = "123456789";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCodigoInterno(codigoInterno);
        assertEquals("123456789", obj.getCodigoInterno());
    }

}