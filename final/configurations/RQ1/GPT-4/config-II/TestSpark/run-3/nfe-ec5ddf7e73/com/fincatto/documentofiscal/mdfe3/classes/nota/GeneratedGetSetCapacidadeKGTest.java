package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedGetSetCapacidadeKGTest {

    @Test
    public void getSetCapacidadeKGTest() {
        MDFInfoModalRodoviarioVeiculoReboque modalRodoviarioReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        modalRodoviarioReboque.setCapacidadeKG("12345");
        assertEquals("12345", modalRodoviarioReboque.getCapacidadeKG());
    }

}