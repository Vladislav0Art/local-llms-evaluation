package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;

public class GeneratedSetCapacidadeM3_InvalidNDigitosReturnsNull {

    @Test
    public void setCapacidadeM3_InvalidNDigitosReturnsNull() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeM3 = "123456789";
        obj.setCapacidadeM3(capacidadeM3);
        assertNull(obj.getCapacidadeM3());
    }

}