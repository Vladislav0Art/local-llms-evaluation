package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class GeneratedSetPlaca_Succeeds {

    @Mock
    private Element element;

    @Test
    public void setPlaca_Succeeds() {
        // Arrange
        String placa = "ABC123";
        MockitoAnnotations.initMocks(this);
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mdfInfoModalRodoviarioVeiculoReboque.setPlaca(placa);

        // Act
        mdfInfoModalRodoviarioVeiculoReboque.setPlaca(element);

        // Assert
        assertEquals(placa, mdfInfoModalRodoviarioVeiculoReboque.getPlaca());
    }

}