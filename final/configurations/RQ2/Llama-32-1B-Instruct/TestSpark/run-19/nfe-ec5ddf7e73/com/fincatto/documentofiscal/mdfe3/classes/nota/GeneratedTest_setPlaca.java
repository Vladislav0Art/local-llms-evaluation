package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest_setPlaca {

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
    public void test_setPlaca() {
        // Arrange
        String placa = "ABC123";
        xmlElement.setAttribute("placa", placa);
        dfStringValidador.setPlaca(placa);

        // Act
        instance.setPlaca(placa);

        // Assert
        assertEquals(placa, instance.getPlaca());
    }

}