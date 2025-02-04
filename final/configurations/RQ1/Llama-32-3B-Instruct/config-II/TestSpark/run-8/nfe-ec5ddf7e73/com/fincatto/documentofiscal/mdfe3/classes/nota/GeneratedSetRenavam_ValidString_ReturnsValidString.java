package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.UUID;

public class GeneratedSetRenavam_ValidString_ReturnsValidString {

    @Test
    public void setRenavam_ValidString_ReturnsValidString() {
        String renavam = "1234567890";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setRenavam(renavam);
        assertEquals(renavam, obj.getRenavam());
    }

}