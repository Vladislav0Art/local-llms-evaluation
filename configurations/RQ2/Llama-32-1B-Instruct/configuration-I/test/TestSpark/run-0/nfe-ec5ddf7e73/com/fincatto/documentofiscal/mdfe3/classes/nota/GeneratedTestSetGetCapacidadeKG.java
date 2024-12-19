package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestSetGetCapacidadeKG {

    @Test
    public void testSetGetCapacidadeKG() {
        String capacidadeKG = "20kg";
        MDFInfoModalRodoviarioVeiculoReboque instance = new MDFInfoModalRodoviarioVeiculoReboque();
        when(instance.getCodigoInterno()).thenReturn("12345");
        when(instance.getPlaca()).thenReturn("ABC123");
        when(instance.getRenavam()).thenReturn("DEF456");
        when(instance.getTara()).thenReturn("GHI789");
        instance.setCapacidadeKG(capacidadeKG);
        assertEquals(capacidadeKG, instance.getCapacidadeKG());
    }

}