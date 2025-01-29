package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest_setCodigoInterno {

    @Mock
    private Element xmlElement;

    @Mock
    private DFStringValidador dfStringValidador;

    public MDFInfoModalRodoviarioVeiculoReboqueTest() {
        MockitoAnnotations.initMocks(this);
    }

    @InjectMocks
    private MDFInfoModalRodoviarioVeiculoReboque instance;

    @Test
    public void test_setCodigoInterno() {
        // Arrange
        String codigoInterno = "12345";
        xmlElement.setAttribute("codigo-interno", codigoInterno);

        // Act
        instance.setCodigoInterno(codigoInterno);

        // Assert
        assertEquals(codigoInterno, instance.getCodigoInterno());
    }

}