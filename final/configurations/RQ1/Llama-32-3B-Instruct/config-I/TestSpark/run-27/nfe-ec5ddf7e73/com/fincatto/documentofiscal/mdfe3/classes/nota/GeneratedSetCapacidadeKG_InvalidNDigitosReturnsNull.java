package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;

public class GeneratedSetCapacidadeKG_InvalidNDigitosReturnsNull {

    @Test
    public void setCapacidadeKG_InvalidNDigitosReturnsNull() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeKG = "123456";
        obj.setCapacidadeKG(capacidadeKG);
        assertNull(obj.getCapacidadeKG());
    }

}