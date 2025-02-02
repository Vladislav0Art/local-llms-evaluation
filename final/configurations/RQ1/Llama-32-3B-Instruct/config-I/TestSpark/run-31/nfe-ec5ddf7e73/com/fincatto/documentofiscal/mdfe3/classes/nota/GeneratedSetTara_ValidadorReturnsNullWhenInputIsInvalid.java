package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetTara_ValidadorReturnsNullWhenInputIsInvalid {

    @Test
    public void setTara_ValidadorReturnsNullWhenInputIsInvalid() {
        String tara = "InvalidInput";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setTara(tara);
        assertNull(obj.getTara());
    }

}