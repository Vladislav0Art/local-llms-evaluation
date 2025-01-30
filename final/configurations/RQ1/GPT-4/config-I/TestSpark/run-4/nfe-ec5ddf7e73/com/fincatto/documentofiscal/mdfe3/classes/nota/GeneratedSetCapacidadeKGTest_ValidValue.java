package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;

import static org.junit.Assert.*;

public class GeneratedSetCapacidadeKGTest_ValidValue {

    @Test
    public void setCapacidadeKGTest_ValidValue() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setCapacidadeKG("50000");
        assertEquals("50000", reboque.getCapacidadeKG());
    }

}