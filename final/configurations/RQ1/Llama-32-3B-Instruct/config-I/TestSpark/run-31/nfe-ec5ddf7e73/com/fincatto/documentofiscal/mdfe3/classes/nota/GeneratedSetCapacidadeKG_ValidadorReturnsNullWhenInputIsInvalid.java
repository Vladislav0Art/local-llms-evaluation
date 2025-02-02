package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetCapacidadeKG_ValidadorReturnsNullWhenInputIsInvalid {

    @Test
    public void setCapacidadeKG_ValidadorReturnsNullWhenInputIsInvalid() {
        String capacidadeKG = "InvalidInput";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeKG(capacidadeKG);
        assertNull(obj.getCapacidadeKG());
    }

}