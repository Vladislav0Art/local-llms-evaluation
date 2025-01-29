package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest_setCapacidadeKG_MDFInfoModalRodoviarioVeiculoReboque {

    @Mock
    private Element xmlElement;

    @Mock
    private DFStringValidador dfStringValidador;

    public MDFInfoModalRodoviarioVeiculoReboqueTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void test_setCapacidadeKG_MDFInfoModalRodoviarioVeiculoReboque() {
        // Arrange
        String capacidadeKG = "10.0";
        MDFInfoModalRodoviarioVeiculoReboque instance = new MDFInfoModalRodoviarioVeiculoReboque();
        Mockito.when(dfStringValidador.validate(xmlElement, "capacidade-kg")).thenReturn(true);
        Mockito.when(xmlElement.getAttribute("capacidade-kg")).thenReturn(capacidadeKG);

        // Act
        instance.setCapacidadeKG(capacidadeKG);

        // Assert
        assertEquals(capacidadeKG, instance.getCapacidadeKG());
    }

}