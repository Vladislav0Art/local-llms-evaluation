package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @InjectMocks
    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void setCodigoInternoValidaTest() {
        // Arrange
        String codigoInterno = "123456";

        // Act
        mdfInfoModalRodoviarioVeiculoReboque.setCodigoInterno(codigoInterno);

        // Assert
        assertNotNull(mdfInfoModalRodoviarioVeiculoReboque.getCodigoInterno());
    }

    @Test
    public void setCodigoInternoInvalidaTest() {
        // Arrange
        String codigoInterno = "123";

        // Act and Assert
        assertThrows(NullPointerException.class, () -> mdfInfoModalRodoviarioVeiculoReboque.setCodigoInterno(codigoInterno));
    }

    @Test
    public void setPlacaValidaTest() {
        // Arrange
        String placa = "ABC1234";

        // Act
        mdfInfoModalRodoviarioVeiculoReboque.setPlaca(placa);

        // Assert
        assertNotNull(mdfInfoModalRodoviarioVeiculoReboque.getPlaca());
    }

    @Test
    public void setPlacaInvalidaTest() {
        // Arrange
        String placa = "ABC";

        // Act and Assert
        assertThrows(NullPointerException.class, () -> mdfInfoModalRodoviarioVeiculoReboque.setPlaca(placa));
    }

}