package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest_setRenavam_MDFInfoModalRodoviarioVeiculoReboque {

    @Mock
    private Element xmlElement;

    @Mock
    private DFStringValidador dfStringValidador;

    public MDFInfoModalRodoviarioVeiculoReboqueTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void test_setRenavam_MDFInfoModalRodoviarioVeiculoReboque() {
        // Arrange
        String renavam = "DEF456";
        MDFInfoModalRodoviarioVeiculoReboque instance = new MDFInfoModalRodoviarioVeiculoReboque();
        Mockito.when(xmlElement.getAttribute("renavam")).thenReturn(renavam);

        // Act
        instance.setRenavam(renavam);

        // Assert
        assertEquals(renavam, instance.getRenavam());
    }

}