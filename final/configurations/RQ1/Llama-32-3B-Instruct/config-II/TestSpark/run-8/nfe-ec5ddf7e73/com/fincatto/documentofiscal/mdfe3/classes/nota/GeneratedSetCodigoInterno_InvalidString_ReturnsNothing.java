package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.UUID;

public class GeneratedSetCodigoInterno_InvalidString_ReturnsNothing {

    @Test
    public void setCodigoInterno_InvalidString_ReturnsNothing() {
        String codigoInterno = "abc";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCodigoInterno(codigoInterno);
        assertEquals("", obj.getCodigoInterno());
    }

}