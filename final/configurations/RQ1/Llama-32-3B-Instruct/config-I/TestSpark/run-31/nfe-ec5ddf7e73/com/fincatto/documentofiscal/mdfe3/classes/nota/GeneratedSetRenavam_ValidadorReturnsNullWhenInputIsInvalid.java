package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetRenavam_ValidadorReturnsNullWhenInputIsInvalid {

    @Test
    public void setRenavam_ValidadorReturnsNullWhenInputIsInvalid() {
        String renavam = "InvalidInput";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setRenavam(renavam);
        assertNull(obj.getRenavam());
    }

}