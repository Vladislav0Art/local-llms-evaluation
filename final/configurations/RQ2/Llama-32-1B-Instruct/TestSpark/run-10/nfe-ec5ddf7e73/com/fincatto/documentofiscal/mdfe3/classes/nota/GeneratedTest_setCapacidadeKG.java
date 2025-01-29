package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.simpleframework.xml.Element;
import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

public class GeneratedTest_setCapacidadeKG {

    @Test
    public void test_setCapacidadeKG() {
        String capacidadeKG = "20kg";
        when(dfStringValidador.validate(capacidadeKG)).thenReturn(true);
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeKG(capacidadeKG);
        assertEquals("20kg", mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeKG());
    }

}