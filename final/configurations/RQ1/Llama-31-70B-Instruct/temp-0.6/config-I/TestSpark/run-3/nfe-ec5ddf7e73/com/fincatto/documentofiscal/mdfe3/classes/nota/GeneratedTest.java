package com.fincatto.documentofiscal.mdfe3.classes.nota;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

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

    @Test
    public void setRenavamTest() {
        // Arrange
        MDFInfoModalRodoviarioVeiculoReboque reboque = Mockito.mock(MDFInfoModalRodoviarioVeiculoReboque.class);
        String renavam = "12345678910";

        // Act
        reboque.setRenavam(renavam);

        // Assert
        assertEquals(renavam, reboque.getRenavam());
    }

}