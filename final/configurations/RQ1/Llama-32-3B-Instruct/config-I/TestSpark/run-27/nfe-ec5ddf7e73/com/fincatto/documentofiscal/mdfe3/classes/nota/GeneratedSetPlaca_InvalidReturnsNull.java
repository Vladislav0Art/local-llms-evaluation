package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;

public class GeneratedSetPlaca_InvalidReturnsNull {

    @Test
    public void setPlaca_InvalidReturnsNull() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String placa = "12345";
        obj.setPlaca(placa);
        assertNull(obj.getPlaca());
    }

}