package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetCapacidadeM3_ValidadorReturnsNullWhenInputIsInvalid {

    @Test
    public void setCapacidadeM3_ValidadorReturnsNullWhenInputIsInvalid() {
        String capacidadeM3 = "InvalidInput";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeM3(capacidadeM3);
        assertNull(obj.getCapacidadeM3());
    }

}