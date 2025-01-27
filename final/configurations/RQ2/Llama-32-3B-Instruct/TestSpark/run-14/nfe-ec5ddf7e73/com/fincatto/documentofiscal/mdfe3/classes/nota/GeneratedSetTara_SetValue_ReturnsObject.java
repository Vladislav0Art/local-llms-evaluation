package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class GeneratedSetTara_SetValue_ReturnsObject {

    private final MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();

    @Test
    public void setTara_SetValue_ReturnsObject() {
        String tara = "1000kg";
        object.setTara(tara);
        assertTrue(object.getTara().equals(tara));
    }

}