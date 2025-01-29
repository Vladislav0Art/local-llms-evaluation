package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest_setRenavam {

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
    public void test_setRenavam() {
        // Arrange
        String renavam = "DEF456";
        xmlElement.setAttribute("renavam", renavam);
        dfStringValidador.setRenavam(renavam);

        // Act
        instance.setRenavam(renavam);

        // Assert
        assertEquals(renavam, instance.getRenavam());
    }

}