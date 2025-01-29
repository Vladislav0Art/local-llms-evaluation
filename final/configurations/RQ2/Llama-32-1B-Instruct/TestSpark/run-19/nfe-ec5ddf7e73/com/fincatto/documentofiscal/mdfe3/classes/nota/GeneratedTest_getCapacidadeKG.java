package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest_getCapacidadeKG {

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
    public void test_getCapacidadeKG() {
        // Arrange
        String capacidadeKG = "10.0";
        xmlElement.setAttribute("capacidade-kg", capacidadeKG);
        dfStringValidador.setCapacidadeKG(capacidadeKG);

        // Act
        String result = instance.getCapacidadeKG();

        // Assert
        assertEquals(capacidadeKG, result);
    }

}