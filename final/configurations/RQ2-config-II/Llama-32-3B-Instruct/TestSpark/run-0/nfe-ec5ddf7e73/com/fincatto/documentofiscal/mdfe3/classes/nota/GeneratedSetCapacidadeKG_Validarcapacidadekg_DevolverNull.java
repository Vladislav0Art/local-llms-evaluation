package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

public class GeneratedSetCapacidadeKG_Validarcapacidadekg_DevolverNull {

    @Test
    public void setCapacidadeKG_Validarcapacidadekg_DevolverNull() {
        // given
        String capacidadeKG = "1000";
        when("setCapacidadeKG").thenReturn(capacidadeKG);

        // when and then
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setCapacidadeKG(capacidadeKG);
        assertEquals(null, mdf.getCapacidadeKG());
    }

}