package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.UUID;

public class GeneratedSetRenavam_InvalidString_ReturnsNothing {

    @Test
    public void setRenavam_InvalidString_ReturnsNothing() {
        String renavam = "abc";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setRenavam(renavam);
        assertEquals("", obj.getRenavam());
    }

}