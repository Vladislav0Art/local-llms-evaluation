package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetCapacidadeM3_ValidadorEsperadoTest {

    @Mock
    private DFStringValidador validador;

    @Test
    public void setCapacidadeM3_ValidadorEsperadoTest() {
        when(validador.capacidadeNDigitos("20", "Capacidade em M3 reboque", 2)).thenReturn(true);
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeM3("20");
        assertEquals(20, Integer.parseInt(obj.getCapacidadeM3()));
    }

}