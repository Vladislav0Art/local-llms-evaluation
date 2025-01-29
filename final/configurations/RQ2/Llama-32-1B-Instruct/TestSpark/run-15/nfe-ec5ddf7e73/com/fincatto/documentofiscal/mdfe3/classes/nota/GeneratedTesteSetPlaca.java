package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GeneratedTesteSetPlaca {

    @Mock
    private Element elementoRecoleta;

    @InjectMocks
    private MDFInfoModalRodoviarioVeiculoReboque modeloRecoleta;

    @Test
    public void testeSetPlaca() {
        String placa = "ABC123";
        assertTrue(modeloRecoleta.setPlaca(placa));
        assertEquals(placa, modeloRecoleta.getPlaca());
    }

}