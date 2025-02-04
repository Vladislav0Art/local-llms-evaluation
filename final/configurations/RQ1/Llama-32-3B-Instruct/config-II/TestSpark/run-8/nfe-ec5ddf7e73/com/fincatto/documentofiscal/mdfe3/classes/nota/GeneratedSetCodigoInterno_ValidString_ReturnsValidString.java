package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.UUID;

public class GeneratedSetCodigoInterno_ValidString_ReturnsValidString {

    @Test
    public void setCodigoInterno_ValidString_ReturnsValidString() {
        String codigoInterno = "1234567890";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCodigoInterno(codigoInterno);
        assertEquals(codigoInterno, obj.getCodigoInterno());
    }

}