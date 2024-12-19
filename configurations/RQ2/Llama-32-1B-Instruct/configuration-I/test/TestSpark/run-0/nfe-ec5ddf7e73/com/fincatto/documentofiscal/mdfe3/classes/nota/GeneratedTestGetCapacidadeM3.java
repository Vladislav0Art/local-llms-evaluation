package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestGetCapacidadeM3 {

    @Test
    public void testGetCapacidadeM3() {
        String capacidadeM3 = "5m3";
        MDFInfoModalRodoviarioVeiculoReboque instance = new MDFInfoModalRodoviarioVeiculoReboque();
        when(instance.getCodigoInterno()).thenReturn("12345");
        when(instance.getPlaca()).thenReturn("ABC123");
        when(instance.getRenavam()).thenReturn("DEF456");
        when(instance.getTara()).thenReturn("GHI789");
        instance.setCapacidadeM3(capacidadeM3);
        assertEquals(capacidadeM3, instance.getCapacidadeM3());
    }

}