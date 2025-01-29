package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest_getCapacidadeKG_MDFInfoModalRodoviarioVeiculoReboque {

    @Mock
    private Element xmlElement;

    @Mock
    private DFStringValidador dfStringValidador;

    public MDFInfoModalRodoviarioVeiculoReboqueTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void test_getCapacidadeKG_MDFInfoModalRodoviarioVeiculoReboque() {
        // Arrange
        String capacidadeKG = "0.5";
        MDFInfoModalRodoviarioVeiculoReboque instance = new MDFInfoModalRodoviarioVeiculoReboque();
        Mockito.when(dfStringValidador.validate(xmlElement, "capacidade-kg")).thenReturn(true);
        Mockito.when(xmlElement.getAttribute("capacidade-kg")).thenReturn(capacidadeKG);

        // Act
        String result = instance.getCapacidadeKG();

        // Assert
        assertEquals(capacidadeKG, result);
    }

}