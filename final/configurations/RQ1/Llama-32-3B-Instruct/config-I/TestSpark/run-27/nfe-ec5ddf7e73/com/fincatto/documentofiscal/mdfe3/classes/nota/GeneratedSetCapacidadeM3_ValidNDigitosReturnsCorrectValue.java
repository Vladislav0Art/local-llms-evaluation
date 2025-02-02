package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;

public class GeneratedSetCapacidadeM3_ValidNDigitosReturnsCorrectValue {

    @Test
    public void setCapacidadeM3_ValidNDigitosReturnsCorrectValue() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeM3 = "12";
        obj.setCapacidadeM3(capacidadeM3);
        assertEquals("12", obj.getCapacidadeM3());
    }

}