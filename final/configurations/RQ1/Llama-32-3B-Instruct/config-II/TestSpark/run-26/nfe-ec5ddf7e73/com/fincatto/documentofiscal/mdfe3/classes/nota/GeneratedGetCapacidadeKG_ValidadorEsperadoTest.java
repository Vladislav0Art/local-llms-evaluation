package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetCapacidadeKG_ValidadorEsperadoTest {

    @Mock
    private DFStringValidador validador;

    @Test
    public void getCapacidadeKG_ValidadorEsperadoTest() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeKG("10");
        assertEquals(10, Integer.parseInt(obj.getCapacidadeKG()));
    }

}