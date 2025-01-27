package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class GeneratedSetCodigoInterno_SetValue_ReturnsObject {

    private final MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();

    @Test
    public void setCodigoInterno_SetValue_ReturnsObject() {
        String codigoInterno = "123456789012";
        object.setCodigoInterno(codigoInterno);
        assertTrue(object.getCodigoInterno().equals(codigoInterno));
    }

}