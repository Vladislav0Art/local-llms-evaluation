package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;

public class GeneratedSetTara_ValidNDigitosReturnsCorrectValue {

    @Test
    public void setTara_ValidNDigitosReturnsCorrectValue() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String tara = "12345";
        obj.setTara(tara);
        assertEquals("12345", obj.getTara());
    }

}