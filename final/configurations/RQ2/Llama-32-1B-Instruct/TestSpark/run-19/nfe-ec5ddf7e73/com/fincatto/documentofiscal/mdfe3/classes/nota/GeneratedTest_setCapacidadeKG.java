package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest_setCapacidadeKG {

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
    public void test_setCapacidadeKG() {
        // Arrange
        String capacidadeKG = "10.0";
        xmlElement.setAttribute("capacidade-kg", capacidadeKG);

        dfStringValidador.setCapacidadeKG(10.5); // Fix the bug here

        // Act
        instance.setCapacidadeKG(capacidadeKG);

        // Assert
        assertEquals(capacidadeKG, instance.getCapacidadeKG());
    }

}