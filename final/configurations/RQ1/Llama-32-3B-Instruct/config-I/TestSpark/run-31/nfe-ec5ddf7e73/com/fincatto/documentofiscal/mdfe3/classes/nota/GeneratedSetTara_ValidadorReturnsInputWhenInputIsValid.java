package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetTara_ValidadorReturnsInputWhenInputIsValid {

    @Test
    public void setTara_ValidadorReturnsInputWhenInputIsValid() {
        String tara = "12345";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setTara(tara);
        assertEquals("12345", obj.getTara());
    }

}