package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestGetCapacidadeKG {

    @Test
    public void testGetCapacidadeKG() {
        String capacidadeKG = "10kg";
        MDFInfoModalRodoviarioVeiculoReboque instance = new MDFInfoModalRodoviarioVeiculoReboque();
        when(instance.getCodigoInterno()).thenReturn("12345");
        when(instance.getPlaca()).thenReturn("ABC123");
        when(instance.getRenavam()).thenReturn("DEF456");
        when(instance.getTara()).thenReturn("GHI789");
        assertEquals(capacidadeKG, instance.getCapacidadeKG());
    }

}