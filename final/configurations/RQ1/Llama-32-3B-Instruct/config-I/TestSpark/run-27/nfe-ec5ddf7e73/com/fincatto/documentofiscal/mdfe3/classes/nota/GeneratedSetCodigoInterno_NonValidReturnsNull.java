package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;

public class GeneratedSetCodigoInterno_NonValidReturnsNull {

    @Test
    public void setCodigoInterno_NonValidReturnsNull() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String codigoInterno = "123456789012";
        obj.setCodigoInterno(codigoInterno);
        assertNull(obj.getCodigoInterno());
    }

}