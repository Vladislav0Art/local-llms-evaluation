package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest_getCapacidadeM3 {

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
    public void test_getCapacidadeM3() {
        // Arrange
        String capacidadeM3 = "0.5";
        xmlElement.setAttribute("capacidade-m3", capacidadeM3);
        dfStringValidador.setCapacidadeM3(capacidadeM3);

        // Act
        String result = instance.getCapacidadeM3();

        // Assert
        assertEquals(capacidadeM3, result);
    }

}