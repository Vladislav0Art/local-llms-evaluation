package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest_getCapacidadeM3_MDFInfoModalRodoviarioVeiculoReboque {

    @Mock
    private Element xmlElement;

    @Mock
    private DFStringValidador dfStringValidador;

    public MDFInfoModalRodoviarioVeiculoReboqueTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void test_getCapacidadeM3_MDFInfoModalRodoviarioVeiculoReboque() {
        // Arrange
        String capacidadeM3 = "0.5";
        MDFInfoModalRodoviarioVeiculoReboque instance = new MDFInfoModalRodoviarioVeiculoReboque();
        Mockito.when(dfStringValidador.validate(xmlElement, "capacidade-m3")).thenReturn(true);
        Mockito.when(xmlElement.getAttribute("capacidade-m3")).thenReturn(capacidadeM3);

        // Act
        String result = instance.getCapacidadeM3();

        // Assert
        assertEquals(capacidadeM3, result);
    }

}