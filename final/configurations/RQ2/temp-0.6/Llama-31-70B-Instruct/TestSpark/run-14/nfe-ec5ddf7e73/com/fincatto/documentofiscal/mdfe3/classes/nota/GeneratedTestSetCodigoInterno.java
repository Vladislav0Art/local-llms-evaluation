package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestSetCodigoInterno {

    @InjectMocks
    private MDFInfoModalRodoviarioVeiculoReboque reboque;

    @Test
    public void testSetCodigoInterno() {
        reboque.setCodigoInterno("codigo");
        Mockito.verify(reboque).setCodigoInterno("codigo");
    }

}