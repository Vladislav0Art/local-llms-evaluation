package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.mockito.MockitoAnnotations.initMocks;

public class GeneratedGetCapacidadeKg_Succeeds {

    @Mock
    public Element element;

    @Test
    public void getCapacidadeKg_Succeeds() {
        // Arrange
        String capacidadeKG = "capacidadeKG";

        // Act
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeKG(capacidadeKG);

        // Assert
        assertEquals(capacidadeKG, mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeKG());
    }

    private void initMocks(Class<?> clazz) {
        initMocks(clazz);
    }

}