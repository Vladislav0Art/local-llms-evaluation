package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.UUID;

public class GeneratedSetTara_ValidString_ReturnsValidString {

    @Test
    public void setTara_ValidString_ReturnsValidString() {
        String tara = "1234567890";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setTara(tara);
        assertEquals(tara, obj.getTara());
    }

}