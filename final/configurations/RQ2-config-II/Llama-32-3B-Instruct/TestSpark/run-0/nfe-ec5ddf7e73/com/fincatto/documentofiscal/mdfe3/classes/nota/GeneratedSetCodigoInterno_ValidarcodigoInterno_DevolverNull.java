package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

public class GeneratedSetCodigoInterno_ValidarcodigoInterno_DevolverNull {

    @Test
    public void setCodigoInterno_ValidarcodigoInterno_DevolverNull() {
        // given
        String codigoInterno = "1234567890";
        when("setCodigoInterno").thenReturn(codigoInterno);

        // when and then
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setCodigoInterno(codigoInterno);
        assertEquals(null, mdf.getCodigoInterno());
    }

}