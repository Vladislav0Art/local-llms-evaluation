package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;

public class GeneratedSetCodigoInterno_ValidReturnsCorrectValue {

    @Test
    public void setCodigoInterno_ValidReturnsCorrectValue() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String codigoInterno = "123456789012";
        obj.setCodigoInterno(codigoInterno);
        assertEquals("12345678901", obj.getCodigoInterno());
    }

}