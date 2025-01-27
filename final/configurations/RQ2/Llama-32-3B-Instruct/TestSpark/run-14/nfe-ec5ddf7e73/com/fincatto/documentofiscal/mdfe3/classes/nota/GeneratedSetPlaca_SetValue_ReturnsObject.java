package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class GeneratedSetPlaca_SetValue_ReturnsObject {

    private final MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();

    @Test
    public void setPlaca_SetValue_ReturnsObject() {
        String placa = "ABC123";
        object.setPlaca(placa);
        assertTrue(object.getPlaca().equals(placa));
    }

}