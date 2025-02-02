package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;

public class GeneratedSetCapacidadeKG_ValidNDigitosReturnsCorrectValue {

    @Test
    public void setCapacidadeKG_ValidNDigitosReturnsCorrectValue() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeKG = "12345";
        obj.setCapacidadeKG(capacidadeKG);
        assertEquals("12345", obj.getCapacidadeKG());
    }

}