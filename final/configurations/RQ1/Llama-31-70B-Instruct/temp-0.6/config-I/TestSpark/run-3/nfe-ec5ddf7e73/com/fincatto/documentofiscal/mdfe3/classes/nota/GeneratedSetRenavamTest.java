package com.fincatto.documentofiscal.mdfe3.classes.nota;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedSetRenavamTest {

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