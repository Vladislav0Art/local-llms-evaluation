package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

public class GeneratedSetPlaca_Validarplaca_DevolverNull {

    @Test
    public void setPlaca_Validarplaca_DevolverNull() {
        // given
        String placa = "ABC123";
        when("setPlaca").thenReturn(placa);

        // when and then
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setPlaca(placa);
        assertEquals(null, mdf.getPlaca());
    }

}