package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetPlaca_SetNullPlaca_ThenPlacaIsNull {

    @InjectMocks
    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void setPlaca_SetNullPlaca_ThenPlacaIsNull() {
        // Act
        mdfInfoModalRodoviarioVeiculoReboque.setPlaca(null);

        // Assert
        assertNull(mdfInfoModalRodoviarioVeiculoReboque.getPlaca());
    }

}