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

public class GeneratedTesteSetCapacidadeM3 {

    @Mock
    private Element elementoRecoleta;

    @InjectMocks
    private MDFInfoModalRodoviarioVeiculoReboque modeloRecoleta;

    @Test
    public void testeSetCapacidadeM3() {
        String capacidadeM3 = "1357";
        assertTrue(modeloRecoleta.setCapacidadeM3(capacidadeM3));
        assertEquals(capacidadeM3, modeloRecoleta.getCapacidadeM3(capacidadeM3));
    }

}