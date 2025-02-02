package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetCapacidadeM3_ValidadorReturnsInputWhenInputIsValid {

    @Test
    public void setCapacidadeM3_ValidadorReturnsInputWhenInputIsValid() {
        String capacidadeM3 = "12";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeM3(capacidadeM3);
        assertEquals("12", obj.getCapacidadeM3());
    }

}