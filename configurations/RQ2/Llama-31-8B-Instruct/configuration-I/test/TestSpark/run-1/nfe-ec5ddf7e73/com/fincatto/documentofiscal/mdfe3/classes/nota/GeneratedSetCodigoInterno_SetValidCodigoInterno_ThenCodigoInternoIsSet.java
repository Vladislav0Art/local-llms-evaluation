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
public class GeneratedSetCodigoInterno_SetValidCodigoInterno_ThenCodigoInternoIsSet {

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void setCodigoInterno_SetValidCodigoInterno_ThenCodigoInternoIsSet() {
        // Arrange
        String codigoInterno = "123456";

        // Act
        mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mdfInfoModalRodoviarioVeiculoReboque.setCodigoInterno(codigoInterno);

        // Assert
        assertEquals(codigoInterno, mdfInfoModalRodoviarioVeiculoReboque.getCodigoInterno());
    }

}