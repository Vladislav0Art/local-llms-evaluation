package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

public class GeneratedSetTara_ValidarTara_DevolverNull {

    @Test
    public void setTara_ValidarTara_DevolverNull() {
        // given
        String tara = "1234567890";
        when("setTara").thenReturn(tara);

        // when and then
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setTara(tara);
        assertEquals(null, mdf.getTara());
    }

}