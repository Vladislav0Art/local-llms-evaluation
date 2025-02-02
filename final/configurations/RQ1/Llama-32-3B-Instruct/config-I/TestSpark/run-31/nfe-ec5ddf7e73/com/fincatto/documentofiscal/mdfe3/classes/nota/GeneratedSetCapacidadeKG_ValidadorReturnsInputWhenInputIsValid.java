package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetCapacidadeKG_ValidadorReturnsInputWhenInputIsValid {

    @Test
    public void setCapacidadeKG_ValidadorReturnsInputWhenInputIsValid() {
        String capacidadeKG = "1234";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeKG(capacidadeKG);
        assertEquals("1234", obj.getCapacidadeKG());
    }

}