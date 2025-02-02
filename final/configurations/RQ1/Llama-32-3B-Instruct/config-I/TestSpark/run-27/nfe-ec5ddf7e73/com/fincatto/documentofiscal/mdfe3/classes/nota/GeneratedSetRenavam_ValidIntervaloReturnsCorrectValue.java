package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;

public class GeneratedSetRenavam_ValidIntervaloReturnsCorrectValue {

    @Test
    public void setRenavam_ValidIntervaloReturnsCorrectValue() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String renavam = "123456789";
        obj.setRenavam(renavam);
        assertEquals("12345", obj.getRenavam());
    }

}