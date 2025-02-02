package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;

public class GeneratedSetTara_InvalidNDigitosReturnsNull {

    @Test
    public void setTara_InvalidNDigitosReturnsNull() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String tara = "123";
        obj.setTara(tara);
        assertNull(obj.getTara());
    }

}