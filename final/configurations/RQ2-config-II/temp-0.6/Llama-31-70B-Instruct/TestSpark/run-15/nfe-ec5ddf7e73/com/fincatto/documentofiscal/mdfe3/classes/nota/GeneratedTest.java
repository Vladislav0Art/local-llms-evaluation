package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
public class GeneratedTest {

    DFStringValidador .class
})

public class MDFInfoModalRodoviarioVeiculoReboqueTest {

    @Test
    public void setCodigoInternoTest() {
        PowerMockito.mockStatic(DFStringValidador.class);
        Mockito.when(DFStringValidador.validador(Mockito.anyString(), Mockito.anyString(), Mockito.anyInt(), Mockito.anyBoolean(), Mockito.anyBoolean())).thenReturn("test");
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mdfInfoModalRodoviarioVeiculoReboque.setCodigoInterno("test");
        assertEquals("test", mdfInfoModalRodoviarioVeiculoReboque.getCodigoInterno());
    }

}