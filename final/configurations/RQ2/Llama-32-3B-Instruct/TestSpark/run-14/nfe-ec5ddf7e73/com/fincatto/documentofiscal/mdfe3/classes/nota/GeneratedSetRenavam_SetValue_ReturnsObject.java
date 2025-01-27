package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class GeneratedSetRenavam_SetValue_ReturnsObject {

    private final MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();

    @Test
    public void setRenavam_SetValue_ReturnsObject() {
        String renavam = "M123456789012";
        object.setRenavam(renavam);
        assertTrue(object.getRenavam().equals(renavam));
    }

}