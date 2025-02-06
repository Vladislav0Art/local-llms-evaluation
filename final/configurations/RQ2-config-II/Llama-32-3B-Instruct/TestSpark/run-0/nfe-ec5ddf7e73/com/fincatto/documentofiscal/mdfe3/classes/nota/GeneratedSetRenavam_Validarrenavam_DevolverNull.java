package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

public class GeneratedSetRenavam_Validarrenavam_DevolverNull {

    @Test
    public void setRenavam_Validarrenavam_DevolverNull() {
        // given
        String renavam = "1234567890";
        when("setRenavam").thenReturn(renavam);

        // when and then
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setRenavam(renavam);
        assertEquals(null, mdf.getRenavam());
    }

}