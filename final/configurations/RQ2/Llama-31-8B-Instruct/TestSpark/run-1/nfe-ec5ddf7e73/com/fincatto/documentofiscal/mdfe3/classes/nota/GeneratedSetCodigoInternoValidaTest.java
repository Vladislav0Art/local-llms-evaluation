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
public class GeneratedSetCodigoInternoValidaTest {

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

}