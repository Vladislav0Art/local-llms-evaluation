package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetRenavam_ValidadorReturnsInputWhenInputIsValid {

    @Test
    public void setRenavam_ValidadorReturnsInputWhenInputIsValid() {
        String renavam = "123456789";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setRenavam(renavam);
        assertEquals("123456789", obj.getRenavam());
    }

}