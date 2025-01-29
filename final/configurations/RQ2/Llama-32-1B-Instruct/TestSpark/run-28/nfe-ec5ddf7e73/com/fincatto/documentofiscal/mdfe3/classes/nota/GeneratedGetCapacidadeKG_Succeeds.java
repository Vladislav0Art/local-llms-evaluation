package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class GeneratedGetCapacidadeKG_Succeeds {

    @Mock
    private Element element;

    @Test
    public void getCapacidadeKG_Succeeds() {
        // Arrange
        String capacidadeKG = "0123456789";
        MockitoAnnotations.initMocks(this);
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeKG(capacidadeKg);

        // Act
        String capacidadeKG = mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeKG();

        // Assert
        assertEquals(capacidadeKG, capacidadeKG);
    }

}