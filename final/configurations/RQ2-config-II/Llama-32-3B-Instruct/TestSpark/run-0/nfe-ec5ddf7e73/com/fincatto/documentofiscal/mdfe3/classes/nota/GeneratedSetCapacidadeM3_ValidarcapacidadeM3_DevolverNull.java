package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

public class GeneratedSetCapacidadeM3_ValidarcapacidadeM3_DevolverNull {

    @Test
    public void setCapacidadeM3_ValidarcapacidadeM3_DevolverNull() {
        // given
        String capacidadeM3 = "1000";
        when("setCapacidadeM3").thenReturn(capacidadeM3);

        // when and then
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setCapacidadeM3(capacidadeM3);
        assertEquals(null, mdf.getCapacidadeM3());
    }

}