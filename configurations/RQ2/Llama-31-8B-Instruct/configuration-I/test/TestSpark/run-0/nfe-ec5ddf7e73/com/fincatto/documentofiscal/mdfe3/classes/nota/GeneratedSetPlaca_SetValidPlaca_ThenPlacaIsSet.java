package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.Mock;
import org.mockito.InjectMocks;

import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class GeneratedSetPlaca_SetValidPlaca_ThenPlacaIsSet {

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void setPlaca_SetValidPlaca_ThenPlacaIsSet() {
        // Arrange
        String placa = "ABC123";

        // Act
        mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mdfInfoModalRodoviarioVeiculoReboque.setPlaca(placa);

        // Assert
        assertEquals(placa, mdfInfoModalRodoviarioVeiculoReboque.getPlaca());
    }

}