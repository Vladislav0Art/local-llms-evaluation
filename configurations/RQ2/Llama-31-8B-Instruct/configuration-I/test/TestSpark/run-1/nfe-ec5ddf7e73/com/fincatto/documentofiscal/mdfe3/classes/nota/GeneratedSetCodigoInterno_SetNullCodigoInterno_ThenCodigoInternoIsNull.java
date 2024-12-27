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
public class GeneratedSetCodigoInterno_SetNullCodigoInterno_ThenCodigoInternoIsNull {

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void setCodigoInterno_SetNullCodigoInterno_ThenCodigoInternoIsNull() {
        // Act
        mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mdfInfoModalRodoviarioVeiculoReboque.setCodigoInterno(null);

        // Assert
        assertNull(mdfInfoModalRodoviarioVeiculoReboque.getCodigoInterno());
    }

}