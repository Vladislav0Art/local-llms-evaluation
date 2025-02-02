package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetCodigoInterno_ValidadorReturnsNullWhenInputIsInvalid {

    @Test
    public void setCodigoInterno_ValidadorReturnsNullWhenInputIsInvalid() {
        String codigoInterno = "InvalidInput";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCodigoInterno(codigoInterno);
        assertNull(obj.getCodigoInterno());
    }

}