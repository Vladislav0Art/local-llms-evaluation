package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest_setCodigoInterno_MDFInfoModalRodoviarioVeiculoReboque {

    @Mock
    private Element xmlElement;

    @Mock
    private DFStringValidador dfStringValidador;

    public MDFInfoModalRodoviarioVeiculoReboqueTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void test_setCodigoInterno_MDFInfoModalRodoviarioVeiculoReboque() {
        // Arrange
        String codigoInterno = "12345";
        MDFInfoModalRodoviarioVeiculoReboque instance = new MDFInfoModalRodoviarioVeiculoReboque();
        Mockito.when(xmlElement.getAttribute("codigo-interno")).thenReturn(codigoInterno);

        // Act
        instance.setCodigoInterno(codigoInterno);

        // Assert
        assertEquals(codigoInterno, instance.getCodigoInterno());
    }

}