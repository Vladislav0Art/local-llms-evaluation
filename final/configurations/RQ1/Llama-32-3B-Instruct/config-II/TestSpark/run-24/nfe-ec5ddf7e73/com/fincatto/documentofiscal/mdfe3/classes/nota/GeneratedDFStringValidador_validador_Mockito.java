package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedDFStringValidador_validador_Mockito {

    @Test
    public void DFStringValidador_validador_Mockito() {
        // Arrange
        String invalidCodigoInterno = "abcdefg";
        String validCodigoInterno = "1234567890123";

        // Act
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        DFStringValidador validadorMockito = Mockito.mock(DFStringValidador.class);
        when(validadorMockito.validador(invalidCodigoInterno, "Codigo interno Veiculo Reboque", 10, false, false)).thenReturn("ABCDEF");
        mdf.setCodigoInterno(invalidCodigoInterno);

        // Assert
        assertEquals("ABCDEF", mdf.getCodigoInterno());
    }

}