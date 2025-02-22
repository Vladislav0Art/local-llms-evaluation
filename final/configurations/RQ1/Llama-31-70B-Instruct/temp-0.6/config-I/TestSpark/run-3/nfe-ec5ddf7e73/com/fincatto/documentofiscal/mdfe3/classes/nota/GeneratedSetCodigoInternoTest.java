package com.fincatto.documentofiscal.mdfe3.classes.nota;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedSetCodigoInternoTest {

    @Test
    public void setCodigoInternoTest() {
        // Arrange
        MDFInfoModalRodoviarioVeiculoReboque reboque = Mockito.mock(MDFInfoModalRodoviarioVeiculoReboque.class);
        String codigoInterno = "1234567890";

        // Act
        reboque.setCodigoInterno(codigoInterno);

        // Assert
        assertEquals(codigoInterno, reboque.getCodigoInterno());
    }

}