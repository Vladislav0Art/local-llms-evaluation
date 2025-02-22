package com.fincatto.documentofiscal.mdfe3.classes.nota;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedSetPlacaTest {

    @Test
    public void setPlacaTest() {
        // Arrange
        MDFInfoModalRodoviarioVeiculoReboque reboque = Mockito.mock(MDFInfoModalRodoviarioVeiculoReboque.class);
        String placa = "AAA1111";

        // Act
        reboque.setPlaca(placa);

        // Assert
        assertEquals(placa, reboque.getPlaca());
    }

}